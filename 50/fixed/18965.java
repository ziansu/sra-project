public void onDestroy() {
    mHandler.removeCallbacksAndMessages(null);
    mQuit = true;
    if ((mFlintVideoManager) != null) {
        mFlintVideoManager.onStop();
    }
}