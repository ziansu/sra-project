public static float arithmeticMean(final float[] array, final int offset, final int length) {
    double sum = 0;
    for (int i = offset; i < (offset + length); i++) {
        sum += array[i];
    }
    return ((float) (sum / (length - offset)));
}