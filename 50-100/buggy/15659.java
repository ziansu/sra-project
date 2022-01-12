public boolean getPixel(int x, int y) {
    if ((((x < 0) || (x > (width))) || (y < 0)) || (y > (height))) {
        return false;
    }
    return ((buffer[(x + ((y / 8) * (width)))]) & (1 << (y & 7))) != 0;
}