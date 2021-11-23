public game.AbstractPiece copyInstanceOfPiece(game.AbstractPiece piece) {
    game.AbstractPiece pieceCopy = null;
    if (piece instanceof game.Bomb) {
        pieceCopy = game.PieceFactory.createBomb();
    }else
        if (piece instanceof game.Flag)
            pieceCopy = game.PieceFactory.createFlag();
        else {
            pieceCopy = new game.Soldier(piece.getRank());
            pieceCopy.setName(piece.getName());
        }
    
    pieceCopy.setOwner(piece.owner);
    pieceCopy.setLocation(piece.getLocation());
    return pieceCopy;
}