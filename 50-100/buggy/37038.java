public boolean comparePiecesOnBoard(eightbitsakabigbyte.Entity.GamePieces currentGamePieces, eightbitsakabigbyte.Entity.GamePieces changedGamePieces) {
    int i;
    for (i = 12; i < 24; i++) {
        if (!((currentGamePieces.getPiece(i).getColumn()) == (changedGamePieces.getPiece(i).getColumn()))) {
            changeIndex = i;
            return true;
        }
    }
    return false;
}