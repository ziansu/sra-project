private boolean isPixel(java.awt.image.BufferedImage img, java.awt.Point point) {
    return ((((point.x) <= ((img.getWidth()) - 1)) && ((point.y) <= ((img.getHeight()) - 1))) && ((point.x) >= 0)) && ((point.y) >= 0);
}