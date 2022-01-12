public void stopBanner() {
    if ((mHandler) != null) {
        isPlaying = false;
        mHandler.removeCallbacksAndMessages(null);
    }
}