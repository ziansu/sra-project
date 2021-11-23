public misc.LongPoint getDisplayedPixel(int row, int col) {
    long x = (java.lang.Math.round(((col * (tileWidth_)) / ((double) (getDownsampleFactor()))))) - (xView_);
    long y = (java.lang.Math.round(((row * (tileHeight_)) / ((double) (getDownsampleFactor()))))) - (yView_);
    return new misc.LongPoint(x, y);
}