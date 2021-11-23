public void resize(java.awt.image.BufferedImage srcImage, java.awt.image.BufferedImage destImage) {
    performChecks(srcImage, destImage);
    int width = destImage.getWidth();
    int height = destImage.getHeight();
    java.awt.Graphics2D g = destImage.createGraphics();
    g.setRenderingHints(RENDERING_HINTS);
    g.drawImage(srcImage, 0, 0, width, height, null);
    g.dispose();
}