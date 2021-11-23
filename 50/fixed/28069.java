@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent e) {
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_ESCAPE)) {
        if ((game) != null)
            game.pauseGame(true);
        
    }
}