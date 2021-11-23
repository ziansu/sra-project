@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent event) {
    switch (event.getKeyCode()) {
        case java.awt.event.KeyEvent.VK_S :
            down = false;
            break;
        case java.awt.event.KeyEvent.VK_A :
            left = false;
            break;
        case java.awt.event.KeyEvent.VK_D :
            right = false;
            break;
        case java.awt.event.KeyEvent.VK_W :
            up = false;
            break;
        default :
            break;
    }
}