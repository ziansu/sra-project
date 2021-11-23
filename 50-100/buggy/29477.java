public boolean isEmpty(int[] userSelection, TicTacToeEnum curentFigure) {
    int row = userSelection[0];
    int col = userSelection[1];
    if (((board[row][col]) != (TicTacToeEnum.EMPTY)) && ((board[row][col]) != curentFigure))
        return false;
    else
        return true;
    
}