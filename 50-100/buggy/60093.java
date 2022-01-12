public Matrix getColumn(int column) {
    Matrix col = new Matrix(rows, 1, new double[rows][1]);
    for (int i = 0; i < (rows); i++) {
        col.mat[i][1] = mat[i][column];
    }
    return col;
}