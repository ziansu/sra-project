public misc.LongPoint getDisplayedPixel(int row, int col) {
    long x = ((col * (tileWidth_)) / (getDownsampleFactor())) - (xView_);
    long y = ((row * (tileHeight_)) / (getDownsampleFactor())) - (yView_);
    return new misc.LongPoint(x, y);
}