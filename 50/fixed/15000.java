public static java.awt.image.BufferedImage loadImage(java.lang.String path) {
    try {
        return javax.imageio.ImageIO.read(new java.io.File(path));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}