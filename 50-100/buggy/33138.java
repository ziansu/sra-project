@java.lang.Override
public game.tictactoe.TicTacToePosition createCopy() {
    int[][] boardCopy = new int[3][3];
    for (int y = 0; y < (board.length); y++) {
        java.lang.System.arraycopy(board[y], 0, boardCopy[y], 0, 2);
    }
    return new game.tictactoe.TicTacToePosition(boardCopy, currentPlayer);
}