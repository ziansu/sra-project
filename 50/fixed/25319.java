public java.awt.image.BufferedImage[] GifReader(java.lang.String fileLocation) throws java.io.IOException {
    java.io.File gif = new java.io.File(fileLocation);
    java.awt.image.BufferedImage image = javax.imageio.ImageIO.read(gif);
}