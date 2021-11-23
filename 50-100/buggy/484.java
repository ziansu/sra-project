public void keyReleased(java.awt.event.KeyEvent e) {
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_A)) {
        right = false;
    }else
        if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_D)) {
            left = false;
        }
    
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_W)) {
        down = false;
    }else
        if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_S)) {
            up = false;
        }
    
}