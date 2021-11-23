@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    if ((image) == null) {
        g.setColor(this.getBackground());
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), sx1, sy1, sx2, sy2, null);
}