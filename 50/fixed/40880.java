public void onCameraAvailable(java.lang.String cameraId) {
    mPreferences.setCamActiv(cameraId, false);
    de.simu.decoit.android.decomap.util.Toolbox.logTxt(this.getLocalClassName(), "Camera is not in use!");
}