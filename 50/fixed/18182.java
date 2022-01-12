@java.lang.Override
protected void onDestroy() {
    if ((mGVRViewManager) != null) {
        mGVRViewManager.onDestroy();
    }
    super.onDestroy();
}