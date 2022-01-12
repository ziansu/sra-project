public synchronized void render(java.awt.Graphics g, int x, int y) {
    g.drawImage(frames[currentFrameIndex].getImage(), x, y, null);
}