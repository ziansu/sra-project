public java.awt.Image Base64ToImage(java.lang.String base64) {
    try {
        byte[] imageBytes = java.util.Base64.getDecoder().decode(base64);
        java.awt.Image image = javax.imageio.ImageIO.read(new java.io.ByteArrayInputStream(imageBytes));
        java.lang.System.out.println(image);
        return image;
    } catch (java.io.IOException ex) {
        return null;
    }
}