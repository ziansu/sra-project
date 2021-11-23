public static java.awt.image.BufferedImage createThumbnail(java.awt.image.BufferedImage img) {
    img = resize(img, Method.SPEED, 250, uk.ac.dundee.computing.aec.instagrim.models.OP_ANTIALIAS);
    return pad(img, 2);
}