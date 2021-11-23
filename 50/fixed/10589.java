@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mCameraSource) != null) {
        mCameraSource.release();
    }
}