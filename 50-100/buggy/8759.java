private void createNextRound() {
    java.lang.System.out.println("create next round");
    java.lang.System.out.println(("current grid num is " + (currentGridNum)));
    if ((currentGridNum) >= (beetle_kit.EstimationGame.MAX_NUM_ROUNDS)) {
        javax.swing.JPanel panel = createEndGamePanel();
        javax.swing.JOptionPane.showOptionDialog(this, panel, "Congratulations!!!", javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.PLAIN_MESSAGE, null, new java.lang.Object[]{  }, null);
        return ;
    }
    createNewGrid();
}