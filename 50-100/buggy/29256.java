private java.util.ArrayList<chessnut.logic.Move> getNextMoves(chessnut.logic.Position position) {
    chessnut.logic.Piece piece = getPieceRef(position);
    if ((piece == null) || ((piece.getColor()) != (nextMove)))
        return null;
    
    java.util.ArrayList<chessnut.logic.Move> moves = piece.getPossibleMoves(position, this);
    return moves;
}