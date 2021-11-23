public java.awt.Color getColor(java.awt.Point p, java.awt.image.BufferedImage image) {
    java.awt.Color c = new java.awt.Color(image.getRGB(p.x, p.y));
    return c;
}