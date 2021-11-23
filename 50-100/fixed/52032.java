private void updateMatrix(int index) {
    for (int i = 0; i < (this.matrix.length); i++) {
        this.matrix[index][i] = 1;
        this.matrix[i][index] = 0;
    }
}