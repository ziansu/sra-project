private static void prettyPrintMatrix(final int[][] matrix) {
    for (int i = 0; i < (matrix[0].length); i++) {
        for (int j = 0; j < (matrix.length); j++) {
            java.lang.System.out.print(((matrix[i][j]) + "  "));
        }
        java.lang.System.out.println("\n");
    }
}