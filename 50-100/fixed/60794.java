@java.lang.Override
protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    super.onLayout(changed, left, top, right, bottom);
    mBubbleImpl.updateDrawable((right - left), (bottom - top), true);
}