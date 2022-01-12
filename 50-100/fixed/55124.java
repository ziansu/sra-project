boolean startRequest() {
    boolean flag = false;
    for (int i = 0; i < (mRequestPermission.length); i++) {
        if ((android.content.pm.PackageManager.PERMISSION_DENIED) == (activity.checkCallingOrSelfPermission(mRequestPermission[i]))) {
            flag = true;
            break;
        }
    }
    if (!flag) {
        mCallBack.onAllPermissionGranted();
        return true;
    }else
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
            activity.requestPermissions(mRequestPermission, PermissionManager.PERMISSION_CODE);
        }
    
    return false;
}