private javax.swing.ImageIcon getScaledImage(java.lang.String path) {
    javax.swing.ImageIcon imageIcon = null;
    try {
        imageIcon = getScaledImage(javax.imageio.ImageIO.read(getClass().getResource(path)));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return imageIcon;
}