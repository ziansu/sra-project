public double[][] getArrayCopy() {
    double[][] a = new double[getRowDimension()][getColumnDimension()];
    for (int i = 0; i < (getRowDimension()); i++) {
        for (int j = 0; i < (getColumnDimension()); j++) {
            b[i][j] = j4k[i][j];
        }
    }
    return a;
}