@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    android.util.Log.i(com.vcredit.cameraHelper.CameraSurfaceView.TAG, "surfaceDestroyed...");
    com.vcredit.cameraHelper.CameraInterface.getInstance().doStopCamera();
}