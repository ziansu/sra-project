private void openFilechooser() {
    originalImage = null;
    file = fc.getSelectedFile();
    try {
        originalImage = ((java.awt.image.BufferedImage) (javax.imageio.ImageIO.read(file)));
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
    icon = scaleBufferedImage(originalImage, originalImageLabel);
    originalImageLabel.setIcon(icon);
}