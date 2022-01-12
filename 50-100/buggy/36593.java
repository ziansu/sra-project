int getArrayPosforRowCol(int row, int col) {
    int pos = 0;
    for (pos = 0; pos < (com.wpwiii.movement2contact.GameActivity.MAX_ARRAY); pos++) {
        if (((_mapSquares[pos].getRow()) == row) && ((_mapSquares[pos].getCol()) == col)) {
            break;
        }
    }
    return pos;
}