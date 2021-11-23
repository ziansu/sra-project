protected void initPowerShutter(com.android.camera.ComboPreferences prefs) {
    java.lang.String val = prefs.getString(CameraSettings.KEY_POWER_SHUTTER, getResources().getString(R.string.pref_camera_power_shutter_default));
    if (!(com.android.camera.util.CameraUtil.hasCameraKey())) {
        com.android.camera.CameraActivity.mPowerShutter = val.equals(CameraSettings.VALUE_ON);
    }
    if ((com.android.camera.CameraActivity.mPowerShutter) && (mInCameraApp)) {
        getWindow().addPrivateFlags(WindowManager.LayoutParams.PRIVATE_FLAG_PREVENT_POWER_KEY);
    }else {
        getWindow().clearPrivateFlags(WindowManager.LayoutParams.PRIVATE_FLAG_PREVENT_POWER_KEY);
    }
}