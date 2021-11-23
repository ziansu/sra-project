private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {
    game.createNewGame(true);
    game.getTimer().resetTime();
    this.repaint();
}