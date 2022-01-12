public void update(aiproj.hexifence.Move m) {
    if ((this.totalMovesLeft) <= 0) {
        return ;
    }
    if ((m.P) == (Piece.BLUE)) {
        gameBoard[m.Row][m.Col] = 'B';
    }else {
        gameBoard[m.Row][m.Col] = 'R';
    }
    (this.totalMovesLeft)--;
}