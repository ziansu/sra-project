public static void printMatlabArray2D(java.lang.Iterable<? extends java.lang.Iterable<java.lang.Double>> ll, int elementsPerLine, java.io.PrintStream out) {
    boolean first = true;
    out.println("[");
    for (java.lang.Iterable<java.lang.Double> l : ll) {
        if (first)
            first = false;
        else
            out.println(", ");
        
        MatlabUtil.printMatlabArray(l, elementsPerLine, out);
    }
    out.println();
    out.println("]");
}