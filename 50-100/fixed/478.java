private int getPlayerForColumn(final int column, final java.lang.String playerFigure) {
    int playerColumnCount = 0;
    for (int i = 0; i < (board.getFiguresArray().length); i++) {
        if (((board.getFigure(i, column)) != null) && ((board.getFigure(i, column).toString()) == playerFigure)) {
            playerColumnCount++;
        }
    }
    return playerColumnCount;
}