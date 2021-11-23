@java.lang.Override
protected boolean setFrame(int l, int t, int r, int b) {
    boolean changed = super.setFrame(l, t, r, b);
    if (changed && (null != (mAttacher))) {
        mAttacher.update();
    }
    return changed;
}