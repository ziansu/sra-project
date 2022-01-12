public static java.awt.image.BufferedImage convertToImage(java.lang.String filePath, int size) throws java.io.IOException {
    return io.indico.api.utils.ImageUtils.convertToImage(new java.io.File(filePath), size);
}