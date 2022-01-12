public java.awt.image.BufferedImage loadImage(java.lang.String fileName) {
    java.awt.image.BufferedImage img;
    try {
        img = javax.imageio.ImageIO.read(new com.base.core.File((("res/textures/" + fileName) + ".png")));
    } catch (java.io.IOException ex) {
        java.lang.System.err.println("ERROR: could not load image");
        ex.printStackTrace();
    }
    return img;
}