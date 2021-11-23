private Board swapLeft(int blankX, int blankY) {
    Board swap = new Board(this.board);
    if (blankX <= (this.dimensions())) {
        throw new java.lang.IndexOutOfBoundsException("Can not swap left most column left");
    }
    exchange(swap.board, blankX, blankY, blankX, (blankY - 1));
    return swap;
}