@java.lang.Override
public void extract(java.awt.image.BufferedImage image) {
    java.awt.image.BufferedImage out = image.getSubimage((((image.getWidth()) * 1) / 3), (((image.getHeight()) * 1) / 3), (((image.getWidth()) * 2) / 3), (((image.getHeight()) * 2) / 3));
    super.extract(out);
}