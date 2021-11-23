@java.lang.Override
public void onClick(android.view.View arg0) {
    if ((com.Yamate.Camera.MainActivity.mYcameraOutputStream) == null)
        com.Yamate.Camera.MainActivity.mYcameraOutputStream = new java.io.ByteArrayOutputStream();
    
    com.Yamate.Camera.Util.setCapturing(true);
    mCamera.takePicture();
}