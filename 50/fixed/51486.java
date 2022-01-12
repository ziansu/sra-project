@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    keysPressed.remove(e.getKeyCode());
    e.consume();
}