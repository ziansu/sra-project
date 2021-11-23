private void cloneMatrix(final int[][] matrix2) {
    int[][] matrix = new int[matrix2.length][matrix2.length];
    for (int i = 0; i < (matrix2.length); i++) {
        for (int j = 0; j < (matrix2.length); j++) {
            matrix[i][j] = matrix2[i][j];
        }
    }
}