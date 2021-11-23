private void drawBackground(java.awt.Graphics g, int[] background, int[] user) {
    int[] pixels;
    java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_ARGB);
    img.setRGB(0, 0, width, height, background, 0, width);
    g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
}