public static void update_board(char name1_char, int col, int row) {
    while ((TicTacToe.board[col][row]) != ' ') {
        java.lang.System.out.println("Oops. That spot has been taken.");
        java.lang.System.out.print("Select a col[0 - 2]: ");
        col = TicTacToe.key.nextInt();
        java.lang.System.out.print("Select a row[0 - 2]: ");
        row = TicTacToe.key.nextInt();
    } 
    if ((TicTacToe.board[col][row]) == ' ') {
        TicTacToe.board[col][row] = name1_char;
    }
    TicTacToe.display_board();
}