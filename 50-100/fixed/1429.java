private java.awt.image.BufferedImage resizeArtwork(java.awt.image.BufferedImage originalImage, int type, int imgSize) {
    java.awt.image.BufferedImage resizedImage = new java.awt.image.BufferedImage(imgSize, imgSize, type);
    java.awt.Graphics2D g = resizedImage.createGraphics();
    g.drawImage(originalImage, 0, 0, imgSize, imgSize, null);
    g.dispose();
    return resizedImage;
}