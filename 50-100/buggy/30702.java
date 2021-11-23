private static long countInversions(int[] array, int start, int end) {
    if (start == end) {
        return 0;
    }else {
        int middle = (start + end) / 2;
        long x = week1.DivideAndConquer.countInversions(array, 0, middle);
        long y = week1.DivideAndConquer.countInversions(array, (middle + 1), end);
        return (x + y) + (week1.DivideAndConquer.countMergeInversions(array, 0, middle, end));
    }
}