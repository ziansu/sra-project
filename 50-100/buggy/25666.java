public static matrix.Matrix zeroes(int rows, int columns) {
    double[][] zeroMatrix = new double[rows][columns];
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < columns; ++j) {
            zeroMatrix[i][j] = 0;
        }
    }
    return new matrix.Matrix(zeroMatrix, rows, columns);
}