private java.awt.image.BufferedImage scaleImage(java.awt.image.BufferedImage img, double scale) {
    java.lang.System.out.println(img.getRaster());
    java.awt.image.BufferedImage after = new java.awt.image.BufferedImage(img.getWidth(), img.getHeight(), java.awt.image.BufferedImage.TYPE_INT_ARGB);
    java.awt.geom.AffineTransform at = new java.awt.geom.AffineTransform();
    at.scale(scale, scale);
    java.awt.image.AffineTransformOp scaleOp = new java.awt.image.AffineTransformOp(at, java.awt.image.AffineTransformOp.TYPE_BILINEAR);
    after = scaleOp.filter(img, after);
    java.lang.System.out.println(after.getRaster());
    return after;
}