int[] mergeColumns_Direct(int[] col1, int[] col2) {
    if ((col2.length) == 0) {
        return col1;
    }
    if ((col1.length) == 0) {
        return java.util.Arrays.copyOf(col2, col2.length);
    }
    for (int ii = 1; ii < (col2.length); ++ii) {
        col1[ii] += col2[ii];
    }
    return col1;
}