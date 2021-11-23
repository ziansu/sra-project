private boolean isSouthEastMovementBlocked(game.Piece piece, int newX, int newY) {
    for (int i = (piece.getY()) - 1; i > newY; i--) {
        int moveCounter = 1;
        if (tileHasPiece(((piece.getX()) + moveCounter), i))
            return true;
        
        moveCounter++;
    }
    return false;
}