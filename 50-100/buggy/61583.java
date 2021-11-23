public void moveDown(com.tetris.saar.tetris.Blocks currentBlock) {
    int id = currentBlock.getId();
    int[] place = currentBlock.getPlace();
    if (isEmptyDown(currentBlock)) {
        removeBlock(currentBlock);
        currentBlock.setPlace(place[0], ((place[1]) + 1));
        this.board[place[0]][((place[1]) - 1)] = 0;
        insertBlock(currentBlock);
    }
}