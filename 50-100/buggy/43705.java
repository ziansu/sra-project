public static void resizeTo(final boolean fit, final java.io.File srcImageFile, final java.io.File dstImageFile, final int width, final int height) throws java.io.IOException {
    javax.imageio.stream.ImageInputStream srcImageInputStream = javax.imageio.ImageIO.createImageInputStream(srcImageFile);
    java.lang.String formatName = javax.imageio.ImageIO.getImageReaders(srcImageInputStream).next().getFormatName();
    java.awt.image.BufferedImage srcImage = jatoo.image.ImageUtils.read(srcImageInputStream);
    java.awt.image.BufferedImage dstImage = jatoo.image.ImageUtils.resizeTo(true, srcImage, width, height);
    jatoo.image.ImageUtils.write(dstImage, formatName, dstImageFile);
}