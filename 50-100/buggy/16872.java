static void show(java.lang.Comparable[] a) {
    for (int i = 0; i < (a.length); ++i) {
        java.lang.System.out.print(((a[i]) + " "));
        if ((i % 10) == 1) {
            java.lang.System.out.println("");
        }
    }
    java.lang.System.out.println("");
}