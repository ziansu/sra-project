public void requestCallPermission(android.app.Activity activity) {
    int callPermissionCheck = android.support.v4.content.ContextCompat.checkSelfPermission(activity, Manifest.permission.CALL_PHONE);
    if (callPermissionCheck != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        if (android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.CALL_PHONE)) {
        }else {
            android.support.v4.app.ActivityCompat.requestPermissions(activity, new java.lang.String[]{ Manifest.permission.CALL_PHONE }, PERMISSION_REQUEST_CALL);
        }
    }
}