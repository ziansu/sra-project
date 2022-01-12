public void printArr() {
    for (char[] x : arr) {
        for (char b : x) {
            java.lang.String up = "" + b;
            up = up.toUpperCase();
            java.lang.System.out.print((up + " | "));
        }
        java.lang.System.out.println("");
    }
}