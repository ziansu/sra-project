private boolean isSorted(java.lang.Comparable[] c, int a, int b) {
    for (int i = b - 1; i >= a; i--) {
        if (org.magicminds.one.util.Sorter.less(c[(i + 1)], c[i])) {
            return false;
        }
    }
    return true;
}