public static void readPhoneStatePermissions(android.app.Activity activity, com.liangmayong.base.support.permission.ActivityPermission.OnPermissionListener listener) {
    java.lang.String[] permissionsNeeded = new java.lang.String[]{ Manifest.permission.READ_PHONE_STATE };
    com.liangmayong.base.support.permission.ActivityPermission.requestPermissions(activity, permissionsNeeded, listener);
}