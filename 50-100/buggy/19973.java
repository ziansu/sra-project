public void change(com.tetris.saar.tetris.Blocks currentBlock) {
    int[] oldPlace = currentBlock.getNextBlock().getPlace();
    if (emptyRot(currentBlock)) {
        removeBlock(currentBlock.getNextBlock());
        this.board[oldPlace[0]][oldPlace[1]] = 0;
        insertBlock(lb.change(currentBlock, this.board));
        removeBlock(currentBlock);
        currentBlock.changeRot();
        insertBlock(currentBlock);
    }
}