@java.lang.Override
public int apply(final int[] counts) {
    int result = 0;
    for (int i = 0; i < (counts.length); ++i) {
        result += counts[i];
    }
    return result >= n ? 1 : 0;
}