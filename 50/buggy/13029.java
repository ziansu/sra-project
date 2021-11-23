public static java.awt.image.BufferedImage cropImage(java.awt.image.BufferedImage src, java.awt.Rectangle rect) {
    java.awt.image.BufferedImage dest = src.getSubimage(0, 0, rect.width, rect.height);
    return dest;
}