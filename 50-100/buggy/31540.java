public void fillNumbersFromMatrix(int[][] mat) {
    for (int i = 0; i < (mat.length); i++) {
        for (int j = 0; j < (mat[0].length); j++) {
            sisf[((i * (mat.length)) + j)].setNumber(mat[j][i]);
        }
    }
}