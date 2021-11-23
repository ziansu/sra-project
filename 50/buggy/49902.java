public boolean isMoveValid(Board board, int move) {
    Position desiredPos = board.positionType(move);
    return desiredPos == (Position.EMPTY);
}