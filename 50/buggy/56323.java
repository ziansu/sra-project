@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.terrydr.eyeScope.CameraActivity.isActive = false;
    org.apache.cordova.LOG.e(com.terrydr.eyeScope.CameraActivity.TAG, ("isActive:" + (com.terrydr.eyeScope.CameraActivity.isActive)));
}