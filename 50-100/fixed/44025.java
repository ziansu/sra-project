private int testPixel(java.awt.image.BufferedImage img, int x, int y) {
    return (((x <= ((img.getWidth()) - 1)) && (y <= ((img.getHeight()) - 1))) && (x >= 0)) && (y >= 0) ? img.getRGB(x, y) : 0;
}