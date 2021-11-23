public boolean intersects(int row, int col) {
    for (aeneas.models.Square s : getSquaresInBoardFrame()) {
        if (((s.getRow()) == row) && ((s.getCol()) == col)) {
            return true;
        }
    }
    return false;
}