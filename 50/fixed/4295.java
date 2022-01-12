public static java.awt.image.BufferedImage load_image(java.lang.String name_p) {
    try {
        return javax.imageio.ImageIO.read(new java.io.File(name_p));
    } catch (java.io.IOException e) {
        return null;
    }
}