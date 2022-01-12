public java.awt.image.BufferedImage flipImage(java.awt.image.BufferedImage img) {
    java.awt.geom.AffineTransform tx = java.awt.geom.AffineTransform.getScaleInstance((-1), 1);
    tx.translate((-(img.getWidth())), 0);
    java.awt.image.AffineTransformOp op = new java.awt.image.AffineTransformOp(tx, java.awt.image.AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
    img = op.filter(img, null);
    return img;
}