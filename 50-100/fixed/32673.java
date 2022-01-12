@java.lang.Override
protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    if ((np) != null) {
        np.drawNinePatch(((java.awt.Graphics2D) (g)), 0, 0, getWidth(), getHeight());
    }
    if ((painter) != null) {
        painter.drawComponent(g, this);
    }
}