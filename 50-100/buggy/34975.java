private Board swapBottom(int blankX, int blankY) {
    Board swap = new Board(this.board);
    if (blankX <= (this.dimensions())) {
        throw new java.lang.IndexOutOfBoundsException("Can not swap bottom row lower");
    }
    exchange(swap.board, blankX, blankY, (blankX + 1), blankY);
    return swap;
}