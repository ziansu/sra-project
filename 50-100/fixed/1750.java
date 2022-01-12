@java.lang.Override
@android.annotation.TargetApi(value = Build.VERSION_CODES.M)
public boolean toggle(boolean enable) {
    try {
        if ((mCameraID) != null) {
            mCameraManager.setTorchMode(mCameraID, enable);
            return true;
        }else {
            return false;
        }
    } catch (android.hardware.camera2.CameraAccessException e) {
        android.widget.Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
        return false;
    }
}