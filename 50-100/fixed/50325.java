@java.lang.Override
public void play(int originRow, int originCol, int destRow, int destCol) throws Exception.GameException {
    if ((board.getLastPlayer()) != (board.getCurrentPlayer())) {
        movePawn(originRow, originCol, destRow, destCol);
        isWinningPosition();
    }
}