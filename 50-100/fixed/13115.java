public boolean canMoveTo(com.alanihre.chess.Point newPosition) {
    com.alanihre.chess.Point piecePosition = getPosition();
    int positionXDelta = java.lang.Math.abs(((newPosition.getX()) - (piecePosition.getX())));
    int positionYDelta = java.lang.Math.abs(((newPosition.getY()) - (piecePosition.getY())));
    return ((positionXDelta == 2) && (positionYDelta == 1)) || ((positionXDelta == 1) && (positionYDelta == 2));
}