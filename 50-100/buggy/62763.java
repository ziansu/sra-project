public java.util.List<piecec.model.Piece> getPiecesAVendre() {
    java.util.List<piecec.model.Piece> piecesAVendre = new java.util.ArrayList<piecec.model.Piece>();
    for (piecec.model.Piece p : pieces) {
        java.lang.System.out.println(p.estDansUnePiece());
        if (!(p.estDansUnePiece()))
            piecesAVendre.add(p);
        
    }
    return piecesAVendre;
}