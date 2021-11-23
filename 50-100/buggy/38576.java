public void keyReleased(int k) {
    if ((k == (com.sun.glass.events.KeyEvent.VK_D)) || (k == (com.sun.glass.events.KeyEvent.VK_RIGHT))) {
        right = false;
        FacingRight = true;
        FacingLeft = false;
    }
    if ((k == (com.sun.glass.events.KeyEvent.VK_A)) || (k == (com.sun.glass.events.KeyEvent.VK_LEFT))) {
        left = false;
        FacingRight = false;
        FacingLeft = true;
    }
}