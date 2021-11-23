public void onDestroy() {
    mHandler.removeCallbacksAndMessages(null);
    mHandler = null;
    mQuit = true;
    if ((mFlintVideoManager) != null) {
        mFlintVideoManager.onStop();
    }
}