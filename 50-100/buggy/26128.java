@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    g.setColor(java.awt.Color.BLACK);
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
    g.drawImage(this.mapImage, imageX, imageY, getImageWidth(), getImageHeight(), null);
    this.repaint();
}