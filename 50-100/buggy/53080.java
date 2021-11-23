public synchronized void decrementUiCounter() {
    mHandler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if ((--(mVisibilityCounter)) == 0) {
                com.google.sample.castcompanionlibrary.utils.LogUtils.LOGD(com.google.sample.castcompanionlibrary.cast.BaseCastManager.TAG, "UI is no longer visible");
                if (mUiVisible) {
                    mUiVisible = false;
                    onUiVisibilityChanged(false);
                }
            }else {
                com.google.sample.castcompanionlibrary.utils.LogUtils.LOGD(com.google.sample.castcompanionlibrary.cast.BaseCastManager.TAG, "UI is visible");
            }
        }
    }, 300);
}