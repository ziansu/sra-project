public static void save_image(java.awt.image.BufferedImage image_p, java.lang.String name_p) {
    final java.lang.String format = "png";
    try {
        java.io.File outputfile = new java.io.File(name_p);
        javax.imageio.ImageIO.write(image_p, format, outputfile);
    } catch (java.io.IOException e) {
    }
}