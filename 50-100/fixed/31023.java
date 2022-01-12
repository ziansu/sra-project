private void setMinimumScale() {
    final float fw = ((float) (viewportWidth)) / (bitmapWidth);
    final float fh = ((float) (viewportHeight)) / (bitmapHeight);
    minimumScale = java.lang.Math.max(fw, fh);
    scale = java.lang.Math.max(scale, minimumScale);
}