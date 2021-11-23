public static boolean canBeMerged(final de.uni_tuebingen.ub.ixTheo.bibleRangeSearch.Range[] ranges) {
    int maxUpper = ranges[0].upper;
    for (int i = 1; i < (ranges.length); ++i) {
        if ((ranges[i].lower) <= maxUpper) {
            return true;
        }
        maxUpper = java.lang.Math.max(maxUpper, ranges[i].upper);
    }
    return false;
}