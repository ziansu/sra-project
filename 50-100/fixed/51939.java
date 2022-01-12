public static java.awt.image.BufferedImage scale(double factor, java.awt.image.BufferedImage img) {
    int w = img.getWidth();
    int h = img.getHeight();
    java.awt.image.BufferedImage after = new java.awt.image.BufferedImage(w, h, java.awt.image.BufferedImage.TYPE_INT_ARGB);
    java.awt.geom.AffineTransform at = new java.awt.geom.AffineTransform();
    at.scale(factor, factor);
    java.awt.image.AffineTransformOp scaleOp = new java.awt.image.AffineTransformOp(at, java.awt.image.AffineTransformOp.TYPE_BILINEAR);
    after = scaleOp.filter(img, after);
    return after;
}