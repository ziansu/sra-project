private static void prettyPrintMatrix(final int[][] matrix) {
    for (int i = 0; i < (matrix.length); i++) {
        for (int j = 0; j < (matrix[0].length); j++) {
            java.lang.System.out.print(((matrix[i][j]) + "  "));
        }
        java.lang.System.out.println("\n");
    }
}