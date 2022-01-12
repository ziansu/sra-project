@java.lang.Override
protected boolean setFrame(int l, int t, int r, int b) {
    boolean changed = super.setFrame(l, t, r, b);
    if (null != (mAttacher)) {
        mAttacher.update();
    }
    return changed;
}