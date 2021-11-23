private void insertPiece(gameBoard.Piece p) {
    if (!(validPoint(p.getPosition())))
        throw new gameBoard.InvalidPointException(("Could not insert piece, position is invalid: " + (p.getPosition())));
    
    tiles[p.getPosition().x][p.getPosition().y] = p;
    ((p.getSide()) == (gameBoard.Piece.Side.BLACK) ? blackPieces : whitePieces).add(p);
}