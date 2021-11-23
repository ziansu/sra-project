public static int scaleInt(final int in_value, final int in_min, final int in_max, final int out_min, final int out_max) {
    return (((out_max - out_min) * (in_value - in_min)) / (in_max - in_min)) + out_max;
}