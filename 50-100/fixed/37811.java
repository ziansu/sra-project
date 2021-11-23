public java.lang.Boolean doMove() {
    if (isValid()) {
        piece.setLocation(location);
        game.getBoard().addPiece(piece);
        view.getBoard().addPiece(draggedPiece);
        view.getBullpen().getModel().removePiece(piece);
        view.getBullpen().removePiece(draggedPiece);
        view.getBullpen().setSelectedPiece(null);
        game.decrementLimit();
        return true;
    }
}