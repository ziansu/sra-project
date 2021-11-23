public void keyPressed(java.awt.event.KeyEvent e) {
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_A)) {
        right = true;
    }else
        if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_D)) {
            left = true;
        }
    
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_W)) {
        down = true;
    }else
        if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_S)) {
            up = true;
        }
    
}