protected int getScale(final long number) {
    long value = java.lang.Math.abs(number);
    int scale = -1;
    while (value > 0) {
        value /= 1000;
        scale++;
    } 
    return scale;
}