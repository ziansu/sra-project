public boolean check_permission() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        for (java.lang.String permission : PERMISSION_LIST) {
            if ((android.support.v4.content.ContextCompat.checkSelfPermission(mActivity, permission)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))
                return false;
            
        }
    }
    return true;
}