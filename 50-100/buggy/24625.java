@java.lang.Override
public void keyTyped(java.awt.event.KeyEvent e) {
    this.getGame().getKeyManager().onKeyPress(e.getKeyCode());
    this.getCurrentScreen().onKeyPress(e);
    this.getEventHandler().onKeyPress(e);
}