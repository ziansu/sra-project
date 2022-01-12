void setPiece(jchess.core.pieces.Piece piece) {
    this.piece = piece;
    if (piece != null) {
        this.piece.setSquare(this);
    }
}