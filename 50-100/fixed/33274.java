public static long[] reduce(long[] values, int divisor) {
    final long[] result = new long[values.length];
    for (int i = 0; i < (values.length); i++) {
        result[i] = (values[i]) / divisor;
    }
    return result;
}