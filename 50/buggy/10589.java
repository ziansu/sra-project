@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mFaceDetect.removeAllViews();
    mPreviewContainer.removeView(mPreview);
    mCameraSource.release();
}