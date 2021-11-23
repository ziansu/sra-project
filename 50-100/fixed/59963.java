private void showIconPreview() {
    if ((model) == null)
        return ;
    
    try {
        java.lang.String size = checkBoxXxhdpi.getText();
        java.io.InputStream is = getClass().getResourceAsStream(model.getLocalPath(size, true));
        java.awt.image.BufferedImage img = generateColoredIcon(javax.imageio.ImageIO.read(is));
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(img);
        imageLabel.setIcon(icon);
    } catch (java.lang.Exception e) {
    }
}