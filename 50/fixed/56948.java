@java.lang.Override
public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    mTickerStopped = true;
}