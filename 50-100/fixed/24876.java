@java.lang.Override
protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g));
    int h = getHeight();
    int w = getWidth();
    g2.setColor(java.awt.Color.WHITE);
    g2.fillRect(0, 0, w, h);
    g2.setColor(java.awt.Color.BLACK);
    g2.draw(path);
}