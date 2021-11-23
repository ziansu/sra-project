public int peek(int x, int y) {
    if (!(inBounds(x, y))) {
        java.lang.System.out.println((((("x: " + x) + ", y: ") + y) + " out of bounds"));
        return 0;
    }
    (numTurns)++;
    Square peekingAt = board[x][y];
    if (peekingAt.flagged) {
        return 0;
    }
    revealZeros(x, y);
    return peekingAt.value;
}