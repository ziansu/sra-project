private void clearTheCurrentGame() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            application.TicTacToeApp.board[i][j].clear();
            java.lang.System.out.println("clear");
        }
    }
    application.TicTacToeApp.neadNewGame = false;
    application.TicTacToeApp.playable = true;
}