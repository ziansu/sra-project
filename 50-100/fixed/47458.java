public void sendGoHome() {
    if (gc.isConnected()) {
        try {
            if ((gameMode) == 2) {
                gc.sendObject("##GO##HOME##");
            }
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(games.tictactoe.gui.TicTacToePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (java.lang.ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(games.tictactoe.gui.TicTacToePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}