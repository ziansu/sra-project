public void resize(java.awt.image.BufferedImage srcImage, java.awt.image.BufferedImage destImage) {
    performChecks(srcImage, destImage);
    int width = destImage.getWidth();
    int height = destImage.getHeight();
    java.awt.Graphics2D g = createGraphics(destImage);
    g.drawImage(srcImage, 0, 0, width, height, null);
    g.dispose();
}