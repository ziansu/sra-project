public void movePiece(main.java.Position curPos, main.java.Position newPos) {
    main.java.Piece pieceToMove = board.gridLookup(curPos);
    if ((pieceToMove.getColor()) != (this.whosTurn)) {
        java.lang.String msg = "Cannot move piece of the other color";
        this.exceptionThrown = new java.lang.IllegalArgumentException(msg);
        setChanged();
        return ;
    }
    try {
        board.movePiece(curPos, newPos);
    } catch (main.java.InvalidPositionException e) {
        this.exceptionThrown = e;
    }
    setChanged();
}