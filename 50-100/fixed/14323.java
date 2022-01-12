private void populateRandomly() {
    for (int i = 0; i < (blocks.length); i++) {
        blocks[i] = new com.gmail.enzocampanella98.candidatecrush.board.Block[blocks.length];
        for (int j = 0; j < (blocks[i].length); j++) {
            blocks[i][j] = getNewRandomBlock(i, j);
        }
    }
}