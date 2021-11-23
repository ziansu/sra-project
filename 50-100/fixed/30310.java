private void addBkgColor(float[] rgbaSrc, int[] rgbOut) {
    float[] rgba = new float[]{ 1 , 1 , 1 , 1 };
    AreaPixel.convexCombine(rgbaSrc, rgba, rgba);
    AreaPixel.colorSkipAlpha(rgba, rgbOut);
}