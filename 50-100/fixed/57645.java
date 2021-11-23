private void initCamera(android.view.SurfaceHolder surfaceHolder) {
    try {
        com.google.zxing.camera.CameraManager.get().openDriver(surfaceHolder);
    } catch (java.io.IOException ioe) {
        return ;
    } catch (java.lang.RuntimeException e) {
        return ;
    }
    if ((handler) == null) {
        handler = new com.google.zxing.decoding.CaptureActivityHandler(this, decodeFormats, characterSet);
    }
}