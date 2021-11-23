private boolean isNorthEastMovementBlocked(game.Piece piece, int newX, int newY) {
    int moveCounter = 1;
    for (int i = (piece.getY()) + 1; i < newY; i++) {
        if (tileHasPiece(((piece.getX()) + moveCounter), i))
            return true;
        
        moveCounter++;
    }
    return false;
}