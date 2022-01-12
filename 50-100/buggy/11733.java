static java.lang.Object[] boxAndPadWithZeros(int length, long[] values) {
    long[] padded;
    if ((values.length) == length) {
        padded = values;
    }else {
        padded = new long[length];
        java.lang.System.arraycopy(values, 0, padded, 0, values.length);
    }
    return java.util.Arrays.stream(padded).boxed().toArray();
}