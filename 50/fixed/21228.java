@java.lang.Override
protected void onPause() {
    releaseCameraAndPreview();
    super.onPause();
}