private boolean checkRowsForWin(final java.lang.String playerFigure) {
    for (int column = 0; column < (board.getFiguresArray().length); column++) {
        if ((getPlayerForColumn(column, playerFigure)) == (board.getFiguresArray().length)) {
            return true;
        }
    }
    return false;
}