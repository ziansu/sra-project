private java.util.ArrayList<model.piece.Piece> getActivePieces(java.util.ArrayList<model.piece.Piece> piecesList) {
    java.util.ArrayList<model.piece.Piece> aP = new java.util.ArrayList<model.piece.Piece>();
    for (model.piece.Piece p : piecesList) {
        if ((p.getInPlay()) && ((p.getTeam()) == (_ac.getGameController().getCurrentTeam()))) {
            aP.add(p);
        }
    }
    return aP;
}