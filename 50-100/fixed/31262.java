@java.lang.Override
public void advanceIfNeeded(int minval) {
    while (((hs) >>> 16) < (minval >>> 16)) {
        ++(pos);
        nextContainer();
    } 
    if (hasNext()) {
        iter.advanceIfNeeded(org.roaringbitmap.Util.lowbits(minval));
        if (!(iter.hasNext())) {
            ++(pos);
            nextContainer();
        }
    }
}