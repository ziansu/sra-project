@java.lang.Override
public java.lang.String toString() {
    java.lang.String s = "";
    if (output.equals("_json"))
        s += " output=" + (output);
    
    return "tojson" + s;
}