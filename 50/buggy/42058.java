@java.lang.Override
public void onGlobalLayout() {
    getViewTreeObserver().removeOnGlobalLayoutListener(this);
    mCameraPreviewContainer.setLayoutParams(new android.widget.LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, ((int) ((CAMERA_PREVIEW_ASPECT_RATIO) * (getWidth())))));
    setupCameraPreview();
}