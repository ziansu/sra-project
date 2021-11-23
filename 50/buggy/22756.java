static java.awt.image.BufferedImage deepCopy(java.awt.image.BufferedImage bi) {
    java.awt.image.ColorModel cm = bi.getColorModel();
    boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
    java.awt.image.WritableRaster raster = bi.copyData(null);
    return new java.awt.image.BufferedImage(cm, raster, isAlphaPremultiplied, null);
}