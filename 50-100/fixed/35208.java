public static void println(java.lang.Object... objects) {
    boolean first = true;
    for (java.lang.Object o : objects) {
        if (!first) {
            java.lang.System.out.print(", ");
        }else {
            first = false;
        }
        java.lang.System.out.print(o.toString());
    }
    java.lang.System.out.println();
}