public synchronized void decrementUiCounter() {
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