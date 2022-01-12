public void flag(int x, int y) {
    if (!(inBounds(x, y))) {
        java.lang.System.err.println((((("x: " + x) + ", y: ") + y) + " out of bounds"));
        return ;
    }
    if (board[x][y].shown) {
        return ;
    }
    (numTurns)++;
    Square curr = board[x][y];
    curr.flagged = true;
    numMinesLeft += (curr.flagged) ? 1 : -1;
}