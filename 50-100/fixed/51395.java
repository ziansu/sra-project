@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
    if ((mCamera) != null) {
        mCamera.setPreviewCallback(null);
        try {
            mCamera.setPreviewDisplay(null);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        mCamera.release();
        mCamera = null;
    }
    if ((mffmpegProc) != null) {
        mffmpegProc.destroy();
        mffmpegProc = null;
    }
}