private void addDelayOperation(int delayMillis) {
    if (!(mDelayed)) {
        mDelayed = mHandler.postDelayed(mDisconnectRunnable, delayMillis);
    }
}