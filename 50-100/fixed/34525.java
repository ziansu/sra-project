public static byte[] BufferedImageToBytes(java.awt.image.BufferedImage bufferedImage) {
    byte[] imageInByte = new byte[0];
    if (bufferedImage == null) {
        return new byte[0];
    }
    try (java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream()) {
        javax.imageio.ImageIO.write(bufferedImage, "jpg", byteArrayOutputStream);
        byteArrayOutputStream.flush();
        imageInByte = byteArrayOutputStream.toByteArray();
    } catch (java.io.IOException e) {
        com.louie.authcode.rest.utils.HTMLUtil.LOGGER.error(e.getMessage(), e);
    }
    return imageInByte;
}