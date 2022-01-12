public static void print(int[] o) {
    java.lang.String delim = "{";
    for (int elem : o) {
        myUtils.ConsolePrinting.print(delim);
        myUtils.ConsolePrinting.print(elem);
        delim = ", ";
    }
    delim = (delim.equals("{")) ? "{}" : "}";
    myUtils.ConsolePrinting.print(delim);
}