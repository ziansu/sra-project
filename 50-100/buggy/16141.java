public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String hold = "Hold!\nNow it\'s ";
    int total = (currentGame.getTotalScore(currentPlayer)) + (currentGame.getRoundScore());
    if (total > (Actions.SCORE_THRESHOLD)) {
        java.lang.String results = currentGame.getWinner();
        endGame(results);
    }else {
        setCurrentPlayer(currentGame.hold());
        updateTurnLabel(currentPlayer);
        updateRoundScoreLabel(0);
        javax.swing.JOptionPane.showMessageDialog(null, ((hold + (currentPlayer)) + "'s turn."));
    }
}