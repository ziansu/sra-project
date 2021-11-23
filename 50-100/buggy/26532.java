public static <T extends java.lang.Iterable<E>, E extends java.io.Serializable> void print(T o) {
    java.lang.String delim = "{";
    for (E elem : o) {
        myUtils.ConsolePrinting.print(delim);
        myUtils.ConsolePrinting.print(elem);
        delim = ", ";
    }
    delim = (delim.equals("{")) ? "{}" : "}";
    myUtils.ConsolePrinting.print(delim);
}