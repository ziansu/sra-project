private void setMinimumScale() {
    final float fw = ((float) (viewportWidth)) / (bitmapWidth);
    final float fh = ((float) (viewportHeight)) / (bitmapHeight);
    scale = minimumScale = java.lang.Math.max(fw, fh);
}