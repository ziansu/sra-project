public static <T extends java.io.Serializable> void print(T[] o) {
    java.lang.String delim = "{";
    for (T elem : o) {
        myUtils.ConsolePrinting.print(delim);
        myUtils.ConsolePrinting.print(elem);
        delim = ", ";
    }
    delim = (delim.equals("{")) ? "{}" : "}";
    myUtils.ConsolePrinting.print(delim);
}