public java.util.List<piecec.model.Piece> getPiecesAVendre() {
    java.util.List<piecec.model.Piece> piecesAVendre = new java.util.ArrayList<piecec.model.Piece>();
    for (piecec.model.Piece p : pieces) {
        if (!(p.estDansUnePiece()))
            piecesAVendre.add(p);
        
    }
    return piecesAVendre;
}