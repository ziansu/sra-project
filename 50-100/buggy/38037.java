public void makeSuccessor(int guess) {
    while ((board[curRow][curCol]) != (SudokuModel.EMPTY)) {
        incrementCursor();
        if ((isMultiple(((curRow) + 1), box)) && (isMultiple(((curCol) + 1), box))) {
            return ;
        }
    } 
    board[curRow][curCol] = guess;
}