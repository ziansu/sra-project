private void DrawField(char[][] f) {
    for (char[] x : f) {
        for (char y : x) {
            java.lang.System.out.print((y + " "));
        }
        java.lang.System.out.println();
    }
}