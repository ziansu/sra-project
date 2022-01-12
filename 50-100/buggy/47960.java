private boolean withinRegularBoard(int row, int col) {
    if ((((row < 0) || (row > 3)) || (col < 0)) || (col > 2)) {
        java.lang.System.out.println(((("row or column invalid row: " + row) + " col: ") + col));
        return false;
    }
    return true;
}