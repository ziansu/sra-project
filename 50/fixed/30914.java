private static java.awt.image.BufferedImage getImage(java.lang.String filename) {
    java.awt.image.BufferedImage img = null;
    try {
        img = javax.imageio.ImageIO.read(new java.io.File(filename));
    } catch (java.io.IOException e) {
        java.lang.System.out.println((filename + e));
    }
    return img;
}