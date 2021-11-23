@java.lang.Override
protected void onResume() {
    if ((hasCameraPermissions()) && ((mCamera) != null)) {
        mCamera.start();
        mProgressBar.setVisibility(View.GONE);
    }
    final net.gini.switchsdk.Image selectedImage = getIntent().getParcelableExtra(net.gini.switchsdk.TakePictureActivity.STATE_KEY_SELECTED_IMAGE);
    if (selectedImage != null) {
        mPresenter.onImageSelected(selectedImage);
    }else {
        mPresenter.onTakePictureSelected();
    }
    super.onResume();
}