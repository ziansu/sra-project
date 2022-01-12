public int bestDirection() {
    if ((target.row) < (getRow())) {
        prevdir = 2;
    }
    if ((target.row) > (getRow())) {
        prevdir = 3;
    }
    if ((target.col) < (getCol())) {
        prevdir = 0;
    }
    if ((target.col) > (getCol())) {
        prevdir = 1;
    }
    return prevdir;
}