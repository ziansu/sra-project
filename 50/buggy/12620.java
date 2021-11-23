@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((mGVRViewManager) != null) {
        mGVRViewManager.onPause();
    }
    if (null != (mDockEventReceiver)) {
        mDockEventReceiver.stop();
    }
}