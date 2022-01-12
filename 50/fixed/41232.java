public boolean onBoard(int x, int y) {
    return (((x >= 0) && (x < (numCols()))) && (y >= 0)) && (y < (numRows()));
}