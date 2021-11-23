@java.lang.Override
public void onPreviewFrame(byte[] data, android.hardware.Camera camera) {
    if ((mDrawerHandler) != null) {
        synchronized(mSynOperation) {
            if ((isPreviewing) || (isRecording)) {
                mDrawerHandler.sendMessage(mDrawerHandler.obtainMessage(com.cgfay.caincamera.core.CameraDrawer.CameraDrawerHandler.MSG_PREVIEW_CALLBACK, data));
            }
        }
    }
    if ((mPreviewBuffer) != null) {
        camera.addCallbackBuffer(mPreviewBuffer);
    }
}