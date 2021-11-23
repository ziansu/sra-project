public static void computer_choice(char name2_char) {
    int col = TicTacToe.r.nextInt(TicTacToe.COLS);
    int row = TicTacToe.r.nextInt(TicTacToe.ROWS);
    while ((TicTacToe.board[row][col]) != ' ') {
        col = TicTacToe.r.nextInt(TicTacToe.COLS);
        row = TicTacToe.r.nextInt(TicTacToe.ROWS);
    } 
    if ((TicTacToe.board[col][row]) == ' ') {
        TicTacToe.board[col][row] = name2_char;
    }
}