private void ROL() {
    int t = (a) >> 7;
    a <<= 1;
    a &= 255;
    a |= c;
    c = t;
    z = 0;
    if ((a) == 0) {
        z = 1;
    }
    n = (a) >> 7;
}