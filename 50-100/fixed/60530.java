public static int[] getColZeros(int[][] matrix) {
    int dim = matrix.length;
    int[] colZeros = new int[dim];
    for (int j = 0; j < dim; j++) {
        int num = 0;
        for (int i = 0; i < dim; i++) {
            if ((matrix[i][j]) == 0) {
                num++;
            }
        }
        colZeros[j] = num;
    }
    return colZeros;
}