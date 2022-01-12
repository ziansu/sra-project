public void setMatrix(int i0, int i1, int[] c, Matrix X) {
    for (int i = i0; i <= i1; i++) {
        for (int j = 0; j < (c.length); j++) {
            matrix[i][j] = X.matrix[i][c[j]];
        }
    }
}