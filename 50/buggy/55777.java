@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mCamera.release();
    mCamera = null;
}