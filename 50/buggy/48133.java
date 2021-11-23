public void setSource(java.awt.image.BufferedImage sourceImage, int srcX, int srcY, float strength) {
    this.strength = strength;
    this.sourceImage = sourceImage;
    lastX = srcX;
    lastY = srcY;
    firstUsageInStroke = true;
}