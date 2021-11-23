@java.lang.Override
public void onPause() {
    if (inPreview) {
        camera.stopPreview();
    }
    if ((camera) != null) {
        camera.release();
        camera = null;
        inPreview = false;
    }
    super.onPause();
}