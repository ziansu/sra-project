public void attackEnemy(javax.swing.JButton button) {
    appendMessage("enemy took x damage");
    bi.team.Game.toggleTurn();
    load.start(null);
    enableButtons();
}