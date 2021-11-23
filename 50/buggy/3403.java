@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    android.util.Log.i("XXX", "Surface destroyed !!");
    if ((com.example.acedeno.customcamera.CustomCameraActivity.camera) != null) {
        com.example.acedeno.customcamera.CustomCameraActivity.camera.stopPreview();
        com.example.acedeno.customcamera.CustomCameraActivity.camera.release();
        com.example.acedeno.customcamera.CustomCameraActivity.camera = null;
        previewing = false;
    }
}