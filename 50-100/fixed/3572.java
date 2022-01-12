protected boolean canMovePiece(com.alanihre.chess.piece.Piece piece, com.alanihre.chess.Point newPosition) {
    if (!(getBoard().positionWithinBoardBounds(newPosition))) {
        throw new com.alanihre.chess.game.InvalidMoveException("New position is outside board bounds");
    }
    if ((piece.getColor()) != (getCurrentMovingPieceColor())) {
        throw new com.alanihre.chess.game.InvalidMoveException("The piece at the entered position can't be moved by you. It has wrong color.");
    }
    if (!(piece.canMoveTo(newPosition))) {
        throw new com.alanihre.chess.game.InvalidMoveException("This piece is not allowed to move to the entered position");
    }
    return true;
}