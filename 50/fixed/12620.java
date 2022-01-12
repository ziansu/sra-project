@java.lang.Override
protected void onPause() {
    if ((mGVRViewManager) != null) {
        mGVRViewManager.onPause();
    }
    if (null != (mDockEventReceiver)) {
        mDockEventReceiver.stop();
    }
    super.onPause();
}