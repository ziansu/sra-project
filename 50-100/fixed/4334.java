public boolean wasMoved(int x, int y) {
    for (pieces.Move move : movesHistory) {
        if (((move.getFromRow()) == x) && ((move.getFromColumn()) == y)) {
            return true;
        }
    }
    return false;
}