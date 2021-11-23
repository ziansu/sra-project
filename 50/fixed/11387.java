@java.lang.Override
public void onSurfaceChanged() {
    synchronized(this) {
        if ((mCamera) != null) {
            setupPreview();
            adjustCameraParameters();
        }
    }
}