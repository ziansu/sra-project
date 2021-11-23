@java.lang.Override
protected synchronized void onLayout(boolean changed, int left, int top, int right, int bottom) {
    if (changed) {
        dst = new android.graphics.Rect(0, 0, getWidth(), getHeight());
    }
}