public void resetAffine(java.lang.Object nativeGraphics) {
    checkEDT();
    java.awt.Graphics2D g = getGraphics(nativeGraphics);
    g.setTransform(new java.awt.geom.AffineTransform());
    if ((zoomLevel) != 1) {
        g.setTransform(java.awt.geom.AffineTransform.getScaleInstance(zoomLevel, zoomLevel));
    }
}