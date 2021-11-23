public boolean isEmpty(int[] userSelection) {
    int row = userSelection[0];
    int col = userSelection[1];
    if ((board[row][col]) == (TicTacToeEnum.EMPTY))
        return true;
    else
        return false;
    
}