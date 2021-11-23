private Board swapRight(int blankX, int blankY) {
    Board swap = new Board(this.board);
    if (blankX <= (this.dimensions())) {
        throw new java.lang.IndexOutOfBoundsException("Can not swap right most column right");
    }
    exchange(swap.board, blankX, blankY, blankX, (blankY + 1));
    return swap;
}