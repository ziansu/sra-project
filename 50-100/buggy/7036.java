public com.tetris.saar.tetris.Blocks moveLeft(com.tetris.saar.tetris.Blocks block, int[][] board) {
    com.tetris.saar.tetris.Blocks temp = block.getNextBlock();
    temp.setPlace(((block.getPlace()[0]) - 1), block.getPlace()[1]);
    setEmptySpaceBlockPos(temp, board);
    return temp;
}