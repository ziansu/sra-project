private java.awt.image.BufferedImage loadMapImage() {
    java.awt.image.BufferedImage return_image = null;
    try (java.io.InputStream fin = getClass().getResourceAsStream("resources/blankmap.png")) {
        return_image = javax.imageio.ImageIO.read(fin);
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e.toString());
        java.lang.System.exit(1);
    }
    return return_image;
}