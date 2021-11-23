private boolean isLegalIndex(int row, int col) {
    return ((row >= 0) && (row < (getHeight()))) && ((col >= 0) && (col < (getWidth())));
}