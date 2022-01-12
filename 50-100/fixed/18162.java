public static java.awt.image.BufferedImage getImage(java.lang.String fileName) {
    try {
        if (fileName != null) {
            return javax.imageio.ImageIO.read(com.clarkparsia.sbol.editor.Images.class.getClassLoader().getResourceAsStream(("images/" + fileName)));
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("images/" + fileName));
        e.printStackTrace();
    }
    return null;
}