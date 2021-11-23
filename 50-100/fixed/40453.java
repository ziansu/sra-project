public int getPieceIntAt(long square) {
    return ((pawns) & square) != 0 ? Piece.PAWN : ((knights) & square) != 0 ? Piece.KNIGHT : ((bishops) & square) != 0 ? Piece.BISHOP : ((rooks) & square) != 0 ? Piece.ROOK : ((queens) & square) != 0 ? Piece.QUEEN : ((kings) & square) != 0 ? Piece.KING : '.';
}