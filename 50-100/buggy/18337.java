public boolean makeMove(nqueue.wa.ma.edu.tictactoe.Move move) {
    if (player1turn) {
        board[move.getX().move.getY()] = X;
        if (isWinner(player1)) {
        }
    }else {
        board[move.getX().move.getY()] = O;
        if (isWinner(player2)) {
        }
    }
    player1turn = player1turn;
}