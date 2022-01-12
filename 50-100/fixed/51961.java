public static void print2D(int[][] matrix) {
    for (int i = 0; i < (matrix.length); i++) {
        for (int j = 0; j < (matrix[0].length); j++) {
            java.lang.System.out.printf("%6d", matrix[i][j]);
        }
        java.lang.System.out.println();
    }
}