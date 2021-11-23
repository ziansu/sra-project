@java.lang.Override
public void onResume() {
    super.onResume();
    mCamera = android.hardware.Camera.open(0);
}