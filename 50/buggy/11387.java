@java.lang.Override
public void onSurfaceChanged() {
    if ((mCamera) != null) {
        setupPreview();
        adjustCameraParameters();
    }
}