public final void setPixel(int x, int y, int value) {
    iPixels[((y * (iWidth)) + x)] = ((short) (value));
}