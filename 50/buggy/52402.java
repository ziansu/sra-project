@java.lang.Override
public void onAutoFocus(boolean success, android.hardware.Camera arg1) {
    if (success) {
        android.util.Log.i(com.terrydr.eyeScope.CameraView.TAG, "自动对焦成功");
    }
}