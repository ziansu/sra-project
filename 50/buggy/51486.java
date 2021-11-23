@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    if (Global.game.pause)
        return ;
    
    keysPressed.remove(e.getKeyCode());
    e.consume();
}