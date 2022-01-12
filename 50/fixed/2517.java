@java.lang.Override
protected synchronized void onLayout(boolean changed, int left, int top, int right, int bottom) {
    if (changed) {
        this.dst.set(0, 0, getWidth(), getHeight());
    }
}