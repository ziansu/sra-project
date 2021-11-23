public java.awt.image.BufferedImage capturePartScreen(java.awt.Robot r, int x, int y, int width, int height) {
    r.mouseMove(x, y);
    java.awt.image.BufferedImage fullScreenImage = r.createScreenCapture(new java.awt.Rectangle(width, height));
    return fullScreenImage;
}