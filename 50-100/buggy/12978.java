public int getPlayerForLine(final int row, final java.lang.String playerFigure) {
    int playerRowCount = 0;
    for (int i = 0; i < (board.getRowLength(row)); i++) {
        if (((board.getFigure(row, i)) != null) && ((board.getFigure(row, i).toString()) == playerFigure)) {
            playerRowCount++;
        }
    }
    return playerRowCount;
}