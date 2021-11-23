public static void init_board() {
    for (int col = 0; col < (TicTacToe.COLS); col++) {
        for (int row = 0; row < (TicTacToe.ROWS); row++) {
            TicTacToe.board[col][row] = ' ';
        }
    }
    java.lang.System.out.println("Welcome to a game of Tic Tac Toe. I hope you're ready.");
    TicTacToe.display_board();
}