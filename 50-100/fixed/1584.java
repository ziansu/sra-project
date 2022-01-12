public boolean isOpen(int row, int col) {
    checkValidInput(row);
    checkValidInput(col);
    if ((grid[(row - 1)][(col - 1)]) == (open)) {
        return true;
    }else {
        return false;
    }
}