private int testPixel(java.awt.image.BufferedImage img, int x, int y) {
    return (((x < (img.getWidth())) && (y < (img.getHeight()))) && (x >= 0)) && (y >= 0) ? img.getRGB(x, y) : 0;
}