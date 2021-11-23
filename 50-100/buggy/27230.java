public void resetGame() {
    inGame = false;
    isMove = false;
    savedColumn = 0;
    savedRow = 0;
    int row;
    int column;
    for (row = 0; row < (checkers.Checkers.tilePerRow); row++) {
        for (column = 0; column < (checkers.Checkers.tilePerRow); column++) {
            checkers.Checkers.availableMoves[column][row] = 0;
        }
    }
    repaint();
}