@java.lang.Override
protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    mTickerStopped = true;
}