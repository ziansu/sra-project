@java.lang.Deprecated
public void flip(final int rangeStart, final int rangeEnd) {
    if (rangeStart >= 0) {
        flip(((long) (rangeStart)), ((long) (rangeEnd)));
    }else {
        flip((rangeStart & 4294967295L), (rangeEnd & 4294967295L));
    }
}