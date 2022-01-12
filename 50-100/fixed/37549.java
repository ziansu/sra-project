public static java.awt.Image resize(java.awt.Image img, int height, int width) {
    java.awt.Image tempImage = img;
    java.awt.image.BufferedImage resized = new java.awt.image.BufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_ARGB_PRE);
    java.awt.Graphics2D imageGr = ((java.awt.Graphics2D) (resized.createGraphics()));
    imageGr.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
    imageGr.drawImage(tempImage, 0, 0, width, height, null);
    imageGr.dispose();
    img = resized.getScaledInstance(width, height, 0);
    return img;
}