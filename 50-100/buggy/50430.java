private int[][] createCopyOfBlocks() {
    int[][] b = new int[dimension()][dimension()];
    for (int i = 0; i < (blocks.length); i++) {
        for (int j = 0; j < (blocks[i].length); j++) {
            b[i][j] = blocks[i][j];
        }
    }
    return b;
}