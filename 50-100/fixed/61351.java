public static void screenCapture(java.lang.String filename) throws java.awt.AWTException, java.io.IOException {
    java.lang.String ext = org.apache.commons.io.FilenameUtils.getExtension(filename);
    java.awt.image.BufferedImage screencapture = new java.awt.Robot().createScreenCapture(new java.awt.Rectangle(java.awt.Toolkit.getDefaultToolkit().getScreenSize()));
    java.io.File file = new java.io.File(filename);
    javax.imageio.ImageIO.write(screencapture, ext, file);
}