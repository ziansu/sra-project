private java.awt.image.BufferedImage loadMapImage() {
    java.awt.image.BufferedImage return_image = null;
    java.io.InputStream fin = null;
    fin = getClass().getResourceAsStream("resources/blankmap.png");
    if (fin == null) {
        java.lang.System.out.println("ERROR: Updater cannot create inputStream into blankmap.png!");
        return null;
    }
    try {
        return_image = javax.imageio.ImageIO.read(fin);
    } catch (java.io.IOException e) {
        java.lang.System.out.println("ERROR: Updater cannot load blankmap.png!");
        java.lang.System.exit(1);
    }
    return return_image;
}