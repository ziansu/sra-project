public double[] getColumnPackedCopy() {
    double[] colPacked = new double[(getRowDimension()) * (getColumnDimension())];
    int counter = 0;
    for (int i = 0; i < (matrix.length); i++) {
        for (int j = 0; j < (matrix[i].length); j++) {
            colPacked[(counter++)] = matrix[j][i];
        }
    }
    return colPacked;
}