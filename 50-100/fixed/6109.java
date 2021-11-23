public void paint(java.awt.Graphics g) {
    java.awt.Image offImage = createImage(this.getWidth(), this.getHeight());
    java.awt.Graphics buffer = offImage.getGraphics();
    world.paint(buffer);
    g.drawImage(offImage, 3, 37, null);
}