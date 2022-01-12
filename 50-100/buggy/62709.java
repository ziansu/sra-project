private java.awt.Image mergeImage(java.awt.Image image1, java.awt.Image image2) {
    java.awt.image.BufferedImage combined = new java.awt.image.BufferedImage(((image1.getWidth(null)) * 2), image1.getHeight(null), java.awt.image.BufferedImage.TYPE_INT_ARGB);
    java.awt.Graphics g = combined.getGraphics();
    g.drawImage(image1, 0, 0, null);
    g.drawImage(image2, image1.getWidth(null), 0, null);
    return combined;
}