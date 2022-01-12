private void setPermissions() {
    java.lang.String[] PERMISSIONS = new java.lang.String[]{ Manifest.permission.CAMERA };
    android.support.v4.app.ActivityCompat.requestPermissions(this, PERMISSIONS, MY_PERMISSIONS_REQUEST_CODE);
}