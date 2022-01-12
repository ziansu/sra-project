private int[][] copyBlocks(int[][] blocks) {
    int[][] copy = new int[blocks.length][blocks.length];
    for (int i = 0; i < (N); i++) {
        for (int j = 0; j < (N); j++) {
            copy[i][j] = blocks[i][j];
        }
    }
    return copy;
}