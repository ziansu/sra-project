void DrawField(int[][] f) {
    for (int[] x : f) {
        for (int y : x) {
            if (!(y == (-1)))
                java.lang.System.out.print(((" " + y) + " "));
            else
                java.lang.System.out.print((y + " "));
            
        }
        java.lang.System.out.println();
    }
}