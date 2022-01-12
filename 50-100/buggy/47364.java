public static byte[] bufferedImageToByteArray(java.awt.image.BufferedImage data) {
    byte[] bytes = null;
    try {
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        javax.imageio.ImageIO.write(data, "jpg", baos);
        bytes = baos.toByteArray();
        return bytes;
    } catch (java.io.IOException e) {
        java.lang.System.out.println("problem while converting image to byte array00");
        e.printStackTrace();
    }
    return bytes;
}