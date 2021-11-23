@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    int key = e.getKeyCode();
    switch (key) {
        case java.awt.event.KeyEvent.VK_A :
            gui.gs.horizontalMove(false);
            break;
        case java.awt.event.KeyEvent.VK_D :
            gui.gs.horizontalMove(true);
            break;
        case java.awt.event.KeyEvent.VK_J :
            gui.gs.rotate(false);
            break;
        case java.awt.event.KeyEvent.VK_L :
            gui.gs.rotate(true);
            break;
    }
}