private void startPreview() {
    android.util.Log.w(org.thoughtcrime.securesms.components.camera.CameraView.TAG, "startPreview()");
    camera.startPreview();
    inPreview = true;
    getHost().autoFocusAvailable();
}