protected int getScale(final long number) {
    long value = number;
    int scale = -1;
    while ((value / 1) != 0) {
        value /= 1000;
        scale++;
    } 
    return scale;
}