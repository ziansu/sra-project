private int[][] copyBlocks(int[][] blocks) {
    int[][] copy = new int[blocks.length][blocks.length];
    for (int i = 0; i < (blocks.length); i++) {
        for (int j = 0; j < (blocks.length); j++) {
            copy[i][j] = blocks[i][j];
        }
    }
    return copy;
}