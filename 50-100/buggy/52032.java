private void updateMatrix(int index) {
    for (int i = 0; i < (matrix[0].length); i++) {
        matrix[i][index] = 1;
        matrix[index][i] = 0;
    }
}