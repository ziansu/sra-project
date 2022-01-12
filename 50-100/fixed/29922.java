public static java.awt.image.BufferedImage generate(java.lang.String filename) {
    java.awt.image.BufferedImage bufferedImage = null;
    try {
        bufferedImage = javax.imageio.ImageIO.read(new java.io.File(filename));
    } catch (java.io.IOException e) {
        return null;
    }
    java.awt.image.BufferedImage scaledImage = new java.awt.image.BufferedImage(100, 100, java.awt.image.BufferedImage.TYPE_INT_RGB);
    scaledImage.createGraphics().drawImage(bufferedImage.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH), 0, 0, null);
    return scaledImage;
}