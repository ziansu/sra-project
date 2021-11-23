private boolean kingMove(int fromRow, int fromCol, int toRow, int toCol) {
    java.lang.System.out.println(("KINGMOVE-fromRow=" + fromRow));
    if ((fromRow != 4) && (fromRow != 8)) {
        java.lang.System.out.println(("KINGMOVE-fromRow-ERROR=" + fromRow));
        java.lang.System.exit((-1));
    }
    boolean possible = isBasicMovePossible(fromRow, fromCol, toRow, toCol);
    if (possible) {
        addPossibleMovesAndThreads(fromRow, fromCol, toRow, toCol);
    }else
        return false;
    
    return true;
}