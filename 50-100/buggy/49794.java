@java.lang.Override
public int[] toIntArray() {
    final int s = size();
    if (s == 0) {
        return PositiveIntSet_impl.EMPTY_INT_ARRAY;
    }
    final int[] r = new int[s];
    int pos = moveToFirst();
    for (int i = 0; i < s; i++) {
        r[i] = pos + (offset);
        pos = set.nextSetBit((pos + 1));
    }
    return r;
}