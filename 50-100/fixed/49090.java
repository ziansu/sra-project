public Matrix arrayRightDivideEquals(Matrix B) {
    for (int i = 0; i < (matrix.length); i++) {
        for (int j = 0; j < (matrix[i].length); j++) {
            matrix[i][j] = (matrix[i][j]) / (B.matrix[i][j]);
        }
    }
    return new Matrix(matrix);
}