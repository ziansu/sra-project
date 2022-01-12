@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    if ((image) == null) {
        image = createImage(getSize().width, getSize().height);
        graphics2D = ((java.awt.Graphics2D) (image.getGraphics()));
        graphics2D.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        clear();
    }
    g.drawImage(image, 0, 0, null);
}