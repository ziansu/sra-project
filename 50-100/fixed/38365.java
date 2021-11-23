public GameBoard chooseGame() {
    java.lang.Object[] games = new java.lang.Object[]{ "Tic Tac Toe" , "Checkers" , "Othello" };
    int choice = javax.swing.JOptionPane.showOptionDialog(null, "Choose a game:", "Game Selection", javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.WARNING_MESSAGE, null, games, games[0]);
    if (choice == 0) {
        return new TicTacToe();
    }else {
        return new TicTacToe();
    }
}