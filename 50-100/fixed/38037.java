public boolean makeSuccessor(int guess) {
    while ((board[curRow][curCol]) != (SudokuModel.EMPTY)) {
        incrementCursor();
        if ((isMultiple(((curRow) + 1), box)) && (isMultiple(((curCol) + 1), box))) {
            if ((board[curRow][curCol]) != (SudokuModel.EMPTY))
                return false;
            
        }
    } 
    board[curRow][curCol] = guess;
    return true;
}