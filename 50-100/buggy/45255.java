@java.lang.Override
public void onAutoFocus(boolean success, android.hardware.Camera camera) {
    try {
        if (!(mbTakePictureAfterFocus)) {
            mCamera.autoFocus(null);
            return ;
        }
        mbTakePictureAfterFocus = false;
        if (mbSupportJpeg)
            mCamera.takePicture(camShutterCallback, null, camPictureCallbackJpeg);
        else
            mCamera.takePicture(camShutterCallback, camPictureCallbackRawData, null);
        
    } catch (java.lang.Exception e) {
        android.widget.Toast.makeText(mContext, "Error in AutoFocusCallback.onAutoFocus()", Toast.LENGTH_LONG).show();
    }
}