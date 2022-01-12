public static float variance(final float[] array, final int offset, final int length) {
    final float mean = com.tagtraum.jipes.math.Floats.arithmeticMean(array, offset, length);
    double sum = 0;
    for (int i = offset; i < (offset + length); i++) {
        final float diff = (array[i]) - mean;
        sum += (diff * diff) / length;
    }
    return ((float) (sum));
}