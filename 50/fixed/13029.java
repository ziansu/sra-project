public static java.awt.image.BufferedImage cropImage(java.awt.image.BufferedImage src, java.awt.Rectangle rect) {
    java.awt.image.BufferedImage dest = src.getSubimage(rect.x, rect.y, rect.width, rect.height);
    return dest;
}