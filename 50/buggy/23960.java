private void setPermissions() {
    java.lang.String[] PERMISSIONS = new java.lang.String[]{ Manifest.permission.CAMERA , Manifest.permission.INTERNET , Manifest.permission.ACCESS_NETWORK_STATE };
    android.support.v4.app.ActivityCompat.requestPermissions(this, PERMISSIONS, MY_PERMISSIONS_REQUEST_CODE);
}