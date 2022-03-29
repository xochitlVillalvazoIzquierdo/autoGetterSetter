/*
    AutoGetterSetter
	
	Simple program that takes a list of variables
	and their return type and produces a String
	with the getter and setter methods for the variables
	given.
	
	Xochitl Villalvazo Izquierdo
	June 2020
 */

package com.company;

public class Main
{
    public static void generateForInts(String type, String... input)
    {
        System.out.println("Generating getter/setter methods for " + type + " variables: " + print(input) + "\n");
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < input.length; i++)
        {
            //making the getter methods
            b.append("public " + type + " " + appendGet(input[i]) + "()\n{\n\treturn this." + input[i] + ";\n}\n");
            //making the setter methods
            b.append("public void " + appendSet(input[i]) + "(" + type + " " + appendNew(input[i]) + ")\n{\n\tthis." + input[i] + " = " + appendNew(input[i]) + ";\n}\n");
        }
        System.out.println(b.toString());
    }

    public static String capFirstLetter(String in)
    {
        StringBuilder b = new StringBuilder();
        b.append(in.substring(0,1).toUpperCase() + in.substring(1));
        return b.toString();
    }

    public static String appendNew(String in)
    {
        StringBuilder b = new StringBuilder();
        b.append("new" + capFirstLetter(in));
        return b.toString();
    }

    public static String appendGet(String in)
    {
        StringBuilder b = new StringBuilder();
        b.append("get" + capFirstLetter(in));
        return b.toString();
    }

    public static String appendSet(String in)
    {
        StringBuilder b = new StringBuilder();
        b.append("set" + capFirstLetter(in));
        return b.toString();
    }

    public static String print(String[] in)
    {
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < in.length; i++)
            b.append(in[i] + " ");
        return b.toString();
    }

    public static void main(String[] args)
    {
        //return type goes here
        String type = "int";
        //list of variables needing getters and setters goes here
        String[] vars = {"num"};
        generateForInts(type, vars);
    }
}
