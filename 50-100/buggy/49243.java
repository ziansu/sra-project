private boolean isPixel(java.awt.image.BufferedImage img, java.awt.Point point) {
    return ((((point.x) < (img.getWidth())) && ((point.y) < (img.getHeight()))) && ((point.x) >= 0)) && ((point.y) >= 0);
}