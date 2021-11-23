public static void init_board() {
    for (int row = 0; row < (TicTacToe.ROWS); row++) {
        for (int col = 0; col < (TicTacToe.COLS); col++) {
            TicTacToe.board[row][col] = ' ';
        }
    }
    java.lang.System.out.println("Welcome to a game of Tic Tac Toe. I hope you're ready.");
    TicTacToe.display_board();
}