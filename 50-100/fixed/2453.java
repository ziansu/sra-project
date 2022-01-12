private boolean kingMove(int fromRow, int fromCol, int toRow, int toCol) {
    boolean possible = isBasicMovePossible(fromRow, fromCol, toRow, toCol);
    if (possible) {
        addPossibleMovesAndThreads(fromRow, fromCol, toRow, toCol);
    }else
        return false;
    
    return true;
}