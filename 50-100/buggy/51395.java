@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
    try {
        mCamera.setPreviewDisplay(null);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    mCamera.setPreviewCallback(null);
    mCamera.release();
    mffmpegProc.destroy();
}