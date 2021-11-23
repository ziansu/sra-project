public int getRedPixelCount(java.awt.image.BufferedImage image) {
    int count = 0;
    for (int i = 0; i < (image.getWidth()); i++) {
        for (int j = 0; j < (image.getHeight()); j++) {
            java.awt.Color color = new java.awt.Color(image.getRGB(i, j));
            if (isRed(color)) {
                count++;
            }
        }
    }
    return count;
}