public void addPiece(ChessPiece chessPiece) {
    if (chessPiece == null) {
        this.setIcon(null);
        this.piece = null;
    }else {
        piece = chessPiece;
        this.setIcon(piece.getIcon());
    }
}