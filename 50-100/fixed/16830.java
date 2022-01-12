@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    android.util.Log.d(videoRecordManagerLogCatTag, "surfaceCreated");
    try {
        InitDeviceCamera();
        InitRecordVideo(surfaceHolderRecordVideo.getSurface(), phoneDeviceCamera, videoSavePath);
    } catch (java.lang.Exception err) {
        android.util.Log.d(videoRecordManagerLogCatTag, ("Error in surfaceCreated: " + (err.getMessage())));
    }
}