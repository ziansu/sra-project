public void askPermission(java.lang.String reqPerm) {
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(context, reqPerm)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(com.avigezerit.callssmslogs.checkPermissionsHelper.activity, new java.lang.String[]{ reqPerm }, setReqCode(reqPerm));
    }
}