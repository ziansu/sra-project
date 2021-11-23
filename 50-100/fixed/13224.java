@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    addView((mCameraView = new android.view.TextureView(getContext())));
    addView((mImagePreview = new android.widget.ImageView(getContext())));
    addView((mVideoPreview = new com.xlythe.view.camera.VideoView(getContext())));
    mImagePreview.setScaleType(ImageView.ScaleType.CENTER_CROP);
    mImagePreview.setVisibility(View.GONE);
    mVideoPreview.setVisibility(View.GONE);
    mCameraView.setSurfaceTextureListener(mSurfaceTextureListener);
}