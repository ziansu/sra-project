public void newGame() throws java.lang.Exception {
    jchess.ui.GameTab.game.startNewGame();
    jchess.ui.GameTab activeGame = jchess.ui.JChessView.getInstance().getActiveTabGame();
    if ((activeGame != null) && ((jchess.ui.JChessView.getInstance().getNumberOfOpenedTabs()) == 0)) {
        activeGame.chessboard.resizeChessboard(activeGame.chessboard.get_height());
        activeGame.chessboard.repaint();
        activeGame.repaint();
    }
    chessboard.repaint();
    this.repaint();
}