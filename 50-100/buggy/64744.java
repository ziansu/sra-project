private void saveImage() {
    java.awt.image.BufferedImage temp_img = getMainScreen().getMainViewImage().getFullMapImage();
    java.lang.String inputString = javax.swing.JOptionPane.showInputDialog("ouput file?");
    try {
        java.io.File outputFile = new java.io.File(inputString);
        javax.imageio.ImageIO.write(temp_img, "png", outputFile);
    } catch (java.io.IOException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error saving file", "oops!", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}