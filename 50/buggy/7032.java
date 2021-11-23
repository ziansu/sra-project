@java.lang.Override
protected void onPause() {
    super.onPause();
    mSwipeDetector.stop();
    mSwipeDetector.unregisterObserver(this);
}