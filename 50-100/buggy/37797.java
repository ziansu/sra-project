public java.awt.image.BufferedImage paintComponent(java.awt.Color clr) {
    java.awt.image.BufferedImage output = new java.awt.image.BufferedImage(100, 20, java.awt.image.BufferedImage.TYPE_INT_RGB);
    java.awt.Graphics2D g2 = output.createGraphics();
    g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setColor(clr);
    g2.fillRect(0, 0, output.getWidth(), output.getHeight());
    return output;
}