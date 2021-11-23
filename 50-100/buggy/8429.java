private boolean isSorted(java.lang.Comparable[] c, int a, int b) {
    for (int i = a; i < b; i++) {
        if (org.magicminds.one.util.Sorter.less(c[i], c[(i + 1)])) {
            return false;
        }
    }
    return true;
}