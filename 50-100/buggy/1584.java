public boolean isOpen(int row, int col) {
    checkValidInput(row);
    checkValidInput(col);
    row = row - 1;
    col = col - 1;
    if ((grid[row][col]) == (open)) {
        return true;
    }else {
        return false;
    }
}