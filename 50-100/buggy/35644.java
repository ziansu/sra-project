private void pointFocus(int x, int y) {
    camera.cancelAutoFocus();
    android.hardware.Camera.Parameters parameters = camera.getParameters();
    showPoint(parameters, x, y);
    try {
        camera.setParameters(parameters);
    } catch (java.lang.Exception e) {
        android.util.Log.wtf(app.horses.camera.ui.activity.TakeActivity.TAG, "pointFocus: ", e);
    }
    autoFocus();
}