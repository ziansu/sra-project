private double convertCoordinate(long value) {
    boolean negative = value < 0;
    value = java.lang.Math.abs(value);
    double minutes = (value % 100000) * 0.001;
    double degrees = (value / 100000) + (minutes / 60);
    return negative ? -degrees : degrees;
}