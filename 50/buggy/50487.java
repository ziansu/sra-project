private boolean isTransparent(int testPixel) {
    return ((testPixel >> 24) & 255) <= (transPixel);
}