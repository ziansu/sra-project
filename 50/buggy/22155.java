private double lowerSensitivity(double value) {
    value = java.lang.Math.pow(value, 3);
    if (value > 1) {
        value = 1;
    }
    if (value < 0) {
        value = 0;
    }
    return value;
}