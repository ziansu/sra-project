public static boolean setAutoExposureLock(boolean lock) {
    if (((com.almalence.opencam.cameracontroller.Camera2Controller.previewRequestBuilder) != null) && ((com.almalence.opencam.cameracontroller.Camera2Controller.getInstance().camDevice) != null)) {
        com.almalence.opencam.cameracontroller.Camera2Controller.previewRequestBuilder.set(CaptureRequest.CONTROL_AE_LOCK, lock);
        com.almalence.opencam.cameracontroller.Camera2Controller.setRepeatingRequest();
        android.preference.PreferenceManager.getDefaultSharedPreferences(com.almalence.opencam.ApplicationScreen.getMainContext()).edit().putBoolean(ApplicationScreen.sAELockPref, lock).commit();
        return true;
    }
    return false;
}