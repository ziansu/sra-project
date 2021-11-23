@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    switch (e.getKeyCode()) {
        case java.awt.event.KeyEvent.VK_S :
            logicTimer.setCyclesPerSecond(gameSpeed);
            logicTimer.reset();
            break;
        default :
    }
}