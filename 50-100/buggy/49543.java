public Matrix timesEquals(double s) {
    for (int i = 0; i < (matrix.length); i++) {
        for (int j = 0; j < (matrix[i].length); j++) {
            matrix[i][j] *= s;
        }
    }
    return matrix;
}