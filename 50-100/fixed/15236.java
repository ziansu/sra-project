public void bindBufferedImageToGLTexture(java.awt.image.BufferedImage bufferedImage) {
    int width2 = org.helioviewer.jhv.opengl.OpenGLHelper.nextPowerOfTwo(bufferedImage.getWidth());
    int height2 = org.helioviewer.jhv.opengl.OpenGLHelper.nextPowerOfTwo(bufferedImage.getHeight());
    if (((this.textureHeight) != height2) && ((this.textureWidth) != width2)) {
        createTexture(bufferedImage, width2, height2);
    }
    updateTexture(bufferedImage);
}