@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    double xscale = (1.0 * (getWidth())) / (image.getWidth(null));
    double yscale = (1.0 * (getHeight())) / (image.getHeight(null));
    java.awt.image.BufferedImageOp imgop = new java.awt.image.AffineTransformOp(java.awt.geom.AffineTransform.getScaleInstance(xscale, yscale), java.awt.image.AffineTransformOp.TYPE_BICUBIC);
    ((java.awt.Graphics2D) (g)).drawImage(image, imgop, 0, 0);
}