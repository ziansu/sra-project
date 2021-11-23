void setPiece(jchess.core.pieces.Piece piece) {
    this.piece = piece;
    this.piece.setSquare(this);
}