public void actionPerformed(java.awt.event.ActionEvent ae) {
    org.magic.game.model.GameManager.getInstance().endTurn(player);
    turnsPanel.initTurn();
}