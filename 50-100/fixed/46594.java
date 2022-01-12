public void movePiece(main.java.Position curPos, main.java.Position newPos) throws java.lang.IllegalArgumentException, main.java.InvalidPositionException {
    main.java.Piece pieceToMove = board.gridLookup(curPos);
    if ((pieceToMove.getColor()) != (this.whosTurn)) {
        java.lang.String msg = "Cannot move piece of the other color";
        throw new java.lang.IllegalArgumentException(msg);
    }
    board.movePiece(curPos, newPos);
    setChanged();
}