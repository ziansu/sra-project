@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_continue :
            com.vcredit.cameraHelper.CameraInterface.getInstance(this).doStartPreview(camSurfaceV.getSurfaceHolder());
            break;
        case R.id.btn_shift :
            com.vcredit.cameraHelper.CameraInterface.getInstance(this).doShiftCamera(camSurfaceV.getSurfaceHolder());
            break;
        case R.id.btn_shutter :
            com.vcredit.cameraHelper.CameraInterface.getInstance(this).doTakePicture();
            break;
    }
}