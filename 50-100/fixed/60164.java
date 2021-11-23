private final void insertRange(final int index, final long range) {
    final int size = rangesSize;
    final int newSize = size + 1;
    final long[] ranges = fixRangeCapacity(newSize);
    java.lang.System.arraycopy(ranges, index, ranges, (index + 1), (size - index));
    ranges[index] = range;
    rangesSize = newSize;
}