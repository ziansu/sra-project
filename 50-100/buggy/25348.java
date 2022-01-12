public void checkOpsPermission(java.lang.String opsPermission, java.lang.String permission, int requestId) {
    if ((Build.VERSION.SDK_INT) >= 19) {
        android.app.AppOpsManager appOpsManager = ((android.app.AppOpsManager) (getSystemService(Context.APP_OPS_SERVICE)));
        int permissionFlag = appOpsManager.checkOp(opsPermission, android.os.Binder.getCallingUid(), getPackageName());
        if (permissionFlag != (android.app.AppOpsManager.MODE_ALLOWED)) {
            android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ permission }, requestId);
        }
    }
}