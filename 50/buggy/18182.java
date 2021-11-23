@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mGVRViewManager) != null) {
        mGVRViewManager.onDestroy();
    }
}