public void addPiece(org.casestudy.target.chess.pieces.Piece piece) {
    java.util.List<org.casestudy.target.chess.pieces.Piece> typePieces = this.pieces.get(piece.getPieceType());
    if (typePieces == null) {
        typePieces = new java.util.ArrayList<org.casestudy.target.chess.pieces.Piece>();
    }
    typePieces.add(piece);
}