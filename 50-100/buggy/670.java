private java.awt.image.BufferedImage openImage(java.lang.String imageName, int width, int height) {
    java.awt.image.BufferedImage image = null;
    java.io.File inputFile = new java.io.File(imageName);
    try {
        image = javax.imageio.ImageIO.read(inputFile);
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Could not read input image.");
        return image;
    }
    if ((width == 0) || (height == 0))
        return image;
    else
        return scaleAndFormatImage(image, width, height);
    
}