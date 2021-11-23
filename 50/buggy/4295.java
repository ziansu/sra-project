public static java.awt.image.BufferedImage load_image(java.lang.String name_p) {
    try {
        return javax.imageio.ImageIO.read(new ca.uwaterloo.enghack17.cvision.File(name_p));
    } catch (ca.uwaterloo.enghack17.cvision.IOException e) {
    }
}