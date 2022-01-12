private static final int searchRangeIndex(final long[] data, final int size, final int value) {
    int rangei = 0;
    int limit = size;
    while (rangei < limit) {
        final int mid = (rangei + limit) >>> 1;
        final int start = com.artemis.CompactComponentHandler.Range.start(data[mid]);
        if (value >= start) {
            rangei = mid + 1;
        }else {
            limit = mid;
        }
    } 
    return rangei;
}