private int[][] createCopyOfBlocks() {
    int[][] b = new int[dimension()][dimension()];
    for (int i = 0; i < (dimension()); i++) {
        for (int j = 0; j < (dimension()); j++) {
            b[i][j] = blocks[i][j];
        }
    }
    return b;
}