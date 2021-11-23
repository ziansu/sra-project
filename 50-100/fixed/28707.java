protected static long[] listToArray(java.util.List<java.lang.Long> list) {
    long[] array = new long[list.size()];
    int i = 0;
    for (long value : list) {
        array[i] = value;
        i += 1;
    }
    return array;
}