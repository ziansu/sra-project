public static <T extends java.lang.Iterable<E>, E extends java.lang.Object> void printDelim(java.lang.String delim, T args) {
    java.lang.String temp = "";
    for (E elem : args) {
        myUtils.ConsolePrinting.print(temp);
        myUtils.ConsolePrinting.print(elem);
        temp = delim;
    }
}