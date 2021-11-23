@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    io.github.data4all.logger.Log.d(io.github.data4all.view.CameraPreview.TAG, "surfaceChanged is called");
    mCamera.stopPreview();
    if ((mCamera) == null) {
        io.github.data4all.logger.Log.e(io.github.data4all.view.CameraPreview.TAG, " mCamera is null");
        return ;
    }
    setCameraDisplayOrientation();
    mCamera.startPreview();
}