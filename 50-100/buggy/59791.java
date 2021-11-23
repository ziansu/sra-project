public void update(aiproj.hexifence.Move m) {
    if ((this.totalMovesLeft) <= 0) {
        return ;
    }
    if ((m.P) == (Piece.BLUE)) {
        gameBoard[m.Col][m.Row] = 'B';
    }else {
        gameBoard[m.Col][m.Row] = 'R';
    }
    (this.totalMovesLeft)--;
}