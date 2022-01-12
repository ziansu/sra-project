private void removeDelayOperation() {
    if (mDelayed) {
        mHandler.removeCallbacks(mDisconnectRunnable);
        mDelayed = false;
    }
}