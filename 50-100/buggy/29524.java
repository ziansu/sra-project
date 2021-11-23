public int getPlayerForBoard(final java.lang.String playerFigure) {
    int playerBoardCount = 0;
    for (int i = 0; i < (board.getFiguresArray().length); i++) {
        playerBoardCount += getPlayerForLine(i, playerFigure);
    }
    return playerBoardCount;
}