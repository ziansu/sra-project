public boolean canMoveTo(com.alanihre.chess.Point newPosition) {
    com.alanihre.chess.Point piecePosition = getPosition();
    int positionXDelta = (newPosition.getX()) - (piecePosition.getX());
    int positionYDelta = (newPosition.getY()) - (piecePosition.getY());
    return ((positionXDelta == 2) && (positionYDelta == 1)) || ((positionXDelta == 1) && (positionYDelta == 2));
}