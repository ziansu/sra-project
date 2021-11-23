public static boolean checkPermisssion(android.app.Activity activity, java.lang.String permission, java.lang.String dialogMessage, int requestCode, boolean finished) {
    if (!(com.penner.architecture.util.PermissionUtils.hasPermission(activity, permission))) {
        if (android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(activity, permission)) {
            com.penner.architecture.util.PermissionUtils.createPermissionDialog(activity, dialogMessage, finished);
        }else {
            android.support.v4.app.ActivityCompat.requestPermissions(activity, new java.lang.String[]{ permission }, requestCode);
        }
        return false;
    }
    return true;
}