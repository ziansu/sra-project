@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mCamera) != null) {
        mCamera.release();
        mCamera = null;
    }
}