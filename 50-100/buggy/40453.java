public int getPieceIntAt(long square) {
    return ((pawns) & square) != 0 ? Piece.PAWN : ((queens) & square) != 0 ? Piece.QUEEN : ((rooks) & square) != 0 ? Piece.ROOK : ((bishops) & square) != 0 ? Piece.BISHOP : ((knights) & square) != 0 ? Piece.KNIGHT : ((kings) & square) != 0 ? Piece.KING : '.';
}