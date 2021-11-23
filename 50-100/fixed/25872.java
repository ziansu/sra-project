private boolean addCellPairLazy() {
    int cellCount = getCellCount();
    while (cellCount < 2) {
        java.lang.Integer freeCell = findFreeCell();
        if (freeCell == null) {
            return false;
        }
        _cellMask._values[freeCell] = 1.0F;
        _cellAges._values[freeCell] = 0.0F;
        ++cellCount;
    } 
    return true;
}