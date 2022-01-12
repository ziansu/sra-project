@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.terrydr.eyeScope.CameraActivity.isActive = false;
}