public void keyPressed(java.awt.event.KeyEvent e) {
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_LEFT)) {
        MoveLeft = true;
    }
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_RIGHT)) {
        MoveRight = true;
    }
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_NUMPAD9)) {
        if (!(autoplay)) {
            autoplay = true;
        }else {
            autoplay = false;
        }
    }
}