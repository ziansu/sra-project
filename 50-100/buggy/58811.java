public void keyPressed(java.awt.event.KeyEvent e) {
    key = e.getKeyCode();
    if ((key) == (java.awt.event.KeyEvent.VK_LEFT)) {
        lauf = 2;
    }else
        if ((key) == (java.awt.event.KeyEvent.VK_RIGHT)) {
            lauf = -2;
        }
    
}