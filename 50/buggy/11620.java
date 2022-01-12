@java.lang.Override
protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    mTrustDrawable.stop();
    requestVisualizer(false, 0);
}