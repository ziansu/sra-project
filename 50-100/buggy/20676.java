public static void computer_choice(char name2_char) {
    int row = TicTacToe.r.nextInt(TicTacToe.ROWS);
    int col = TicTacToe.r.nextInt(TicTacToe.COLS);
    while ((TicTacToe.board[row][col]) != ' ') {
        row = TicTacToe.r.nextInt(TicTacToe.ROWS);
        col = TicTacToe.r.nextInt(TicTacToe.COLS);
    } 
    if ((TicTacToe.board[row][col]) == ' ') {
        TicTacToe.board[row][col] = name2_char;
    }
}