public void initQuadImage(java.awt.image.BufferedImage bigImage, int sourceWidth, int sourceHeight) {
    image = new com.MightyChubz.core.gfx.QuadImage((sourceHeight - 1), (sourceWidth - 1), bigImage);
    image.initQuad(sourceWidth, sourceHeight);
}