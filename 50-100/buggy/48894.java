void updateData(int[][] x) {
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            array2[i][j] = x[j][(7 - i)];
        }
    }
    this.invalidate();
}