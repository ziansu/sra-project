public java.lang.String format(double number, int decimalPlaces) {
    if (decimalPlaces == 0) {
        return format(((double) ((long) (number))));
    }
    double pos = 10;
    for (int iter = 1; iter < decimalPlaces; iter++) {
        pos *= 10;
    }
    long ln = ((long) (number * pos));
    number = ((double) (ln)) / pos;
    return format(number);
}