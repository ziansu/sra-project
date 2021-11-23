@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_continue :
            com.vcredit.cameraHelper.CameraInterface.getInstance().doStartPreview(camSurfaceV.getSurfaceHolder());
            break;
        case R.id.btn_shift :
            com.vcredit.cameraHelper.CameraInterface.getInstance().doShiftCamera(camSurfaceV.getSurfaceHolder());
            break;
        case R.id.btn_shutter :
            com.vcredit.cameraHelper.CameraInterface.getInstance().doTakePicture();
            break;
    }
}