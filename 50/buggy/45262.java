public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    g.setColor(java.awt.Color.LIGHT_GRAY);
    renderGrid(g);
    renderRects(g);
}