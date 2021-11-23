@java.lang.Override
public void advanceIfNeeded(int minval) {
    while (((hs) >>> 16) < (minval >>> 16)) {
        ++(pos);
        if ((pos) < (this.highLowContainer.size())) {
            nextContainer();
        }else {
            return ;
        }
    } 
    if (hasNext()) {
        iter.advanceIfNeeded(org.roaringbitmap.Util.lowbits(minval));
    }
}