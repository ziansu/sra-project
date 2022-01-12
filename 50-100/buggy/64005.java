private static int[] getRowZeros(int[][] matrix) {
    int dim = matrix.length;
    int[] rowZeros = new int[dim];
    for (int i = 0; i < dim; i++) {
        int num = 0;
        for (int j = 0; j < dim; j++) {
            if ((matrix[i][j]) == 0) {
                num++;
            }
        }
        rowZeros[i] = num;
    }
    return rowZeros;
}