@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    game.getPlayer().incMarbles();
    playerMarblesPanel.addMarble();
    updateDisplay();
    move = 0;
}