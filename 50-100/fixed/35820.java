private java.awt.image.BufferedImage mirrorImage(java.awt.image.BufferedImage imageToFlip) {
    java.awt.geom.AffineTransform tx = java.awt.geom.AffineTransform.getScaleInstance((-1), 1);
    tx.translate((-(imageToFlip.getWidth(null))), 0);
    java.awt.image.AffineTransformOp op = new java.awt.image.AffineTransformOp(tx, java.awt.image.AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
    imageToFlip = op.filter(imageToFlip, null);
    return imageToFlip;
}