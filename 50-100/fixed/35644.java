private void pointFocus(int x, int y) {
    try {
        camera.cancelAutoFocus();
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        showPoint(parameters, x, y);
        camera.setParameters(parameters);
    } catch (java.lang.Exception e) {
        android.util.Log.wtf(app.horses.camera.ui.activity.TakeActivity.TAG, "pointFocus: ", e);
    }
    autoFocus();
}