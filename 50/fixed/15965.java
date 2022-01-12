private static long fill(byte value) {
    long fill = value;
    if (value != 0) {
        fill |= fill << 8;
        fill |= fill << 16;
        fill |= fill << 32;
    }
    return fill;
}