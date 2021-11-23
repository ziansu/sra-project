public void drawImage(java.awt.Image img, int x, int y) {
    java.awt.Graphics backBufferGraphics = backBuffer.getGraphics();
    backBufferGraphics.drawImage(img, y, x, this);
}