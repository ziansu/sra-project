@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent event) {
    switch (event.getKeyCode()) {
        case java.awt.event.KeyEvent.VK_DOWN :
            playerToken.down();
            break;
        case java.awt.event.KeyEvent.VK_LEFT :
            playerToken.left();
            break;
        case java.awt.event.KeyEvent.VK_RIGHT :
            playerToken.right();
            break;
        case java.awt.event.KeyEvent.VK_UP :
            playerToken.up();
            break;
    }
}