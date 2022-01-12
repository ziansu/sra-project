private static double naiveStdDev(long[] values) {
    double sum = 0;
    double mean = 0;
    for (final double value : values) {
        sum += value;
    }
    mean = sum / (values.length);
    double squaresum = 0;
    for (final double value : values) {
        squaresum += java.lang.Math.pow((value - mean), 2);
    }
    final double variance = squaresum / (values.length);
    return java.lang.Math.sqrt(variance);
}