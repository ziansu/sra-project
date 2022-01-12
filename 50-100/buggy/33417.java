public void setCell(int value, int row, int column) {
    if (!(SudokuModel.isValid(value))) {
        throw new java.lang.IllegalArgumentException((value + " is not a valid cell number"));
    }
    if (isFixed[row][column]) {
        board[row][column] = value;
    }
}