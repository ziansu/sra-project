public java.awt.image.BufferedImage[] OldGIFtoFrames(java.lang.String fileLocation) throws java.io.IOException {
    File gif = new File(fileLocation);
    javax.imageio.ImageReader reader = new GIFImageReader(new GIFImageReaderSpi());
    reader.setInput(javax.imageio.ImageIO.createImageInputStream(gif));
    java.awt.image.BufferedImage[] ans = new java.awt.image.BufferedImage[reader.getNumImages(true)];
    for (int i = 0; i < (reader.getNumImages(true)); i++) {
        ans[i] = reader.read(i);
    }
    return ans;
}