private byte[] getImageInByteArray(java.awt.image.BufferedImage image) {
    byte[] imageInByte = null;
    try {
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        javax.imageio.ImageIO.write(image, IMAGE_FILE_FORMAT, outputStream);
        outputStream.flush();
        imageInByte = outputStream.toByteArray();
        outputStream.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println(("Image in byte length : " + (imageInByte.length)));
    return imageInByte;
}