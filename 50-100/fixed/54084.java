@java.lang.Override
public void paint(java.awt.Graphics g) {
    super.paintComponent(g);
    if ((image) != null) {
        g.drawImage(image.getScaledInstance(this.getWidth(), (-1), java.awt.Image.SCALE_SMOOTH), 0, 0, null);
    }
}