public double[][] tranMatrix(double[][] matrix, int row, int col) {
    double[][] ret = new double[col][row];
    for (int i = 0; i < row; i++)
        for (int j = 0; j < col; j++) {
            ret[i][j] = matrix[j][i];
        }
    
    return ret;
}