private boolean isValidMoveSquare(int row, int column) {
    if (((((row >= 0) && (row < 8)) && (column >= 0)) && (column < 8)) && ((currentBoard.getBoardArray()[row][column]) == ' '))
        return true;
    
    return false;
}