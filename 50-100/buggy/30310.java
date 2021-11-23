private void addBkgColor(float[] rgbaSrc, int[] rgbOut) {
    float[] rgba = new float[]{ 255 , 255 , 255 , 255 };
    AreaPixel.convexCombine(rgbaSrc, rgba, rgba);
    AreaPixel.colorSkipAlpha(rgba, rgbOut);
}