public void resetGame() {
    savedColumn = 0;
    savedRow = 0;
    inGame = false;
    isMove = false;
    for (int row = 0; row < (checkers.Checkers.tilePerRow); row++) {
        for (int column = 0; column < (checkers.Checkers.tilePerRow); column++) {
            checkers.Checkers.availableMoves[column][row] = 0;
        }
    }
    repaint();
}