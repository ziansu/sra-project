private static void printCollection(java.util.Collection c) {
    java.lang.System.out.print("[");
    for (java.lang.Object o : c) {
        java.lang.System.out.print(o);
        java.lang.System.out.print(", ");
    }
    java.lang.System.out.println("]");
}