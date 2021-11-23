public void undoMove(int column) {
    if ((size[column]) == 0)
        return ;
    
    int row = (edu.frostburg.cosc591_connectx.Board.ROWS) - (size[column]);
    board[row][column] = null;
    --(size[column]);
    --(totalSize);
}