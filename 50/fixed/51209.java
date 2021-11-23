void stopRepeatingTask() {
    if ((mHandler) != null) {
        mHandler.removeCallbacks(mStatusChecker);
    }
}