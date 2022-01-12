public static java.awt.image.BufferedImage toBufferedImage(java.awt.Image image, int bufImgType) {
    if (image instanceof java.awt.image.BufferedImage) {
        return ((java.awt.image.BufferedImage) (image));
    }
    image = new javax.swing.ImageIcon(image).getImage();
    java.awt.image.BufferedImage bufferedImage = new java.awt.image.BufferedImage(image.getWidth(null), image.getHeight(null), bufImgType);
    java.awt.Graphics2D g = bufferedImage.createGraphics();
    g.drawImage(image, 0, 0, null);
    g.dispose();
    return bufferedImage;
}