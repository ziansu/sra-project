public void setPiece(com.radiance.kamisado.Piece piece) {
    this.piece = piece;
    if ((this.piece) != null)
        piece.setLoc(c, r);
    
}