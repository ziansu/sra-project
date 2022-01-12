public double[] getColumnPackedCopy() {
    double[] colPacked = new double[(getRowDimension()) * (getColumnDimension())];
    for (int i = 0; i < (matrix.length); i++) {
        for (int j = 0; j < (matrix[i].length); j++) {
            colPacked[i] = matrix[j][i];
        }
    }
    return colPacked;
}