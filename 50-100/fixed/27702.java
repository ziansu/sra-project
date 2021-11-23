public byte[] imageToBytes(javafx.scene.image.Image screenShot) {
    java.io.ByteArrayOutputStream byteOutput = new java.io.ByteArrayOutputStream();
    byte[] imageBytes = null;
    try {
        javax.imageio.ImageIO.write(javafx.embed.swing.SwingFXUtils.fromFXImage(screenShot, null), "png", byteOutput);
        imageBytes = byteOutput.toByteArray();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return imageBytes;
}