private void placeCurrentCell(int row, int col, Model.BasicCell cell) {
    mCurrentCells[row][col] = cell;
    mArrayCells[((row * (ROW)) + col)] = cell;
}