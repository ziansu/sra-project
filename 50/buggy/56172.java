@java.lang.Override
public void run() {
    com.vcredit.cameraHelper.CameraInterface.getInstance(this).doStartPreview(camSurfaceV.getSurfaceHolder());
}