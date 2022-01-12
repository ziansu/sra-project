static long findMaximun(long start, long end, long k, PossibleMaximum.GetValue getValue) {
    long max = 0;
    for (long i = start + 1; i <= end; i++) {
        long possibleValue = getValue.done(i, start, end, k);
        if ((max < possibleValue) && (possibleValue < k)) {
            max = possibleValue;
        }
        if (max == (k - 1)) {
            return max;
        }
    }
    return max;
}