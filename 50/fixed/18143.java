public static void writeJPG(java.awt.image.BufferedImage image, java.io.File file, float quality) throws java.io.IOException {
    javax.imageio.stream.ImageOutputStream ios = javax.imageio.ImageIO.createImageOutputStream(file);
    if (ios != null) {
        pixelitor.io.JpegOutput.writeJPGtoStream(image, ios, quality);
    }
}