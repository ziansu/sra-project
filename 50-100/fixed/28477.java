public void move(int column, int row, int savedColumn, int savedRow) {
    int tmp = checkers.Checkers.gameBoard[savedColumn][savedRow];
    checkers.Checkers.gameBoard[column][row] = tmp;
    checkers.Checkers.gameBoard[savedColumn][savedRow] = checkers.Checkers.EMPTY;
    checkKing(column, row);
    if ((isMove) == true)
        removePiece(column, row, savedColumn, savedRow);
    
    resetGame();
    nextPlayer();
}