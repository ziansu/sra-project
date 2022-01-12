public static java.awt.image.BufferedImage writeImageDetails(java.awt.image.BufferedImage bi, java.lang.String details) {
    java.awt.image.BufferedImage image = com.comandante.eyeballs.common.ImageFormatting.createLargerImage(bi);
    java.awt.Graphics g = image.getGraphics();
    g.setFont(g.getFont().deriveFont(18.0F));
    g.setColor(java.awt.Color.GRAY);
    g.drawString(details, 5, ((image.getHeight()) - 5));
    g.dispose();
    return image;
}