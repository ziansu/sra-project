public boolean positionWithinBoardBounds(com.alanihre.chess.Point position) {
    return ((((position.getX()) < (getWidth())) && ((position.getX()) > 0)) && ((position.getY()) < (getHeight()))) && ((position.getY()) > 0);
}