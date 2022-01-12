public static void update_board(char name1_char, int row, int col) {
    while ((TicTacToe.board[row][col]) != ' ') {
        java.lang.System.out.println("Oops. That spot has been taken.");
        java.lang.System.out.print("Select a row[0 - 2]: ");
        row = TicTacToe.key.nextInt();
        java.lang.System.out.print("Select a col[0 - 2]: ");
        col = TicTacToe.key.nextInt();
    } 
    if ((TicTacToe.board[row][col]) == ' ') {
        TicTacToe.board[row][col] = name1_char;
    }
    TicTacToe.display_board();
}