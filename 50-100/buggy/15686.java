private chess.ChessPiece getKing(chess.ChessPieceColor player) {
    for (int row = 1; row <= 8; row++) {
        for (int col = 1; col <= 8; col++) {
            chess.ChessPiece piece = getPiece(row, col);
            if ((piece instanceof chess.King) && ((piece.getColor()) == player))
                return piece;
            
        }
    }
    assert false;
    return null;
}