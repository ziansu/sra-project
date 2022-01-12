public static void print(long[] o) {
    java.lang.String delim = "{";
    for (long elem : o) {
        myUtils.ConsolePrinting.print(delim);
        myUtils.ConsolePrinting.print(elem);
        delim = ", ";
    }
    delim = (delim.equals("{")) ? "{}" : "}";
    myUtils.ConsolePrinting.print(delim);
}