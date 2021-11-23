public void keyReleased(int k) {
    player.keyReleased(k);
    if (k == (java.awt.event.KeyEvent.VK_B)) {
        addBomb = false;
    }
}