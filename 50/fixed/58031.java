@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((move) != 0) {
        game.getPlayer().incMarbles();
        playerMarblesPanel.addMarble();
        updateDisplay();
        move = 0;
    }
}