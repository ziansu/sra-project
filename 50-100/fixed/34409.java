public java.awt.image.AffineTransformOp getRotation() {
    double rotationRequired = (theta) - (java.lang.Math.toRadians(0));
    double locationX = (images[type].getWidth()) / 2;
    double locationY = (images[type].getHeight()) / 2;
    java.awt.geom.AffineTransform tx = java.awt.geom.AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
    java.awt.image.AffineTransformOp op = new java.awt.image.AffineTransformOp(tx, java.awt.image.AffineTransformOp.TYPE_BILINEAR);
    return op;
}