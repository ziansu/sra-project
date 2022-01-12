public javax.swing.ImageIcon loadIcon(java.lang.String imagePath) {
    try {
        java.io.InputStream input = com.arcade_renegade.graphics_tools.GraphicsTools.class.getClassLoader().getResourceAsStream(imagePath);
        java.awt.image.BufferedImage image = javax.imageio.ImageIO.read(input);
        return new javax.swing.ImageIcon(image);
    } catch (java.lang.Exception e) {
        return null;
    }
}