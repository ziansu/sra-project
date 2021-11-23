public int scaledvalue2pixel(int y0, int h, double value) {
    double smin = scale(start);
    double smax = scale(end);
    return ((int) (((((-h) * (value - smin)) / (smax - smin)) + y0) + h));
}