public void keyReleased(java.awt.event.KeyEvent e) {
    int key = e.getKeyCode();
    if (key == (java.awt.event.KeyEvent.VK_LEFT)) {
        repaint();
    }
    if (key == (java.awt.event.KeyEvent.VK_RIGHT)) {
        repaint();
    }
}