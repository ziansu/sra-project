private void updateAspectRatio(android.util.Size size) {
    android.view.ViewGroup.LayoutParams currentParams = this.textureView.getLayoutParams();
    currentParams.width = size.getHeight();
    currentParams.height = size.getWidth();
    this.textureView.setLayoutParams(currentParams);
    this.textureView.requestLayout();
    android.util.Log.d(neildg.com.megatronsr.camera2.CameraTextureView.TAG, ((("Image dimensions proposed: " + (currentParams.width)) + " X ") + (currentParams.height)));
}