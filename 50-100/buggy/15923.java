@java.lang.Override
public int apply(final int[] counts) {
    int result = 0;
    for (int i = 0; i < (counts.length); ++i) {
        if ((counts[i]) > 0) {
            ++result;
        }
    }
    return result >= n ? 1 : 0;
}