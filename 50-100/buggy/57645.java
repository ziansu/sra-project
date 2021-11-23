private void initCamera(android.view.SurfaceHolder surfaceHolder) {
    try {
        android.widget.Toast.makeText(this, ("" + (com.google.zxing.camera.CameraManager.get())), Toast.LENGTH_SHORT).show();
        com.google.zxing.camera.CameraManager.get().openDriver(surfaceHolder);
    } catch (java.io.IOException ioe) {
        ioe.printStackTrace();
        return ;
    } catch (java.lang.RuntimeException e) {
        e.printStackTrace();
        return ;
    }
    if ((handler) == null) {
        handler = new com.google.zxing.decoding.CaptureActivityHandler(this, decodeFormats, characterSet);
    }
}