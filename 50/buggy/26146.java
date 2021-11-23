@java.lang.Override
protected int firstChild(int position) {
    int[] cs = children[position];
    if ((cs.length) > 1) {
        return cs[1];
    }
    return NOT_FOUND;
}