private static long countInversions(int start, int end) {
    if (start == end) {
        return 0;
    }else
        if (start < end) {
            int middle = (start + end) / 2;
            long x = week1.DivideAndConquer.countInversions(start, middle);
            long y = week1.DivideAndConquer.countInversions((middle + 1), end);
            return (x + y) + (week1.DivideAndConquer.countMergeInversions(0, middle, end));
        }
    
    return 0;
}