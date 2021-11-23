@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_S)) {
        logicTimer.setCyclesPerSecond(gameSpeed);
        logicTimer.reset();
        break;
    }
}