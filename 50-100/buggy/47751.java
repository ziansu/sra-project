@java.lang.Override
public void paint(java.awt.Graphics g) {
    super.paintComponent(g);
    java.awt.Image img = createImage(viewport.getWidth(), viewport.getHeight());
    java.awt.Graphics g2 = img.getGraphics();
    draw(g2);
    g.drawImage(img, 0, 0, viewport.getWidth(), viewport.getHeight(), null);
}