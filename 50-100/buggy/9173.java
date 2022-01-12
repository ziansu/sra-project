private void doNext(int requestCode, int[] grantResults) {
    if (requestCode == (ACCESS_PERMISSION)) {
        if ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            listener.onGranted();
            com.itheima.mobilesafe.utils.CLog.d(com.itheima.mobilesafe.HomeActivity.TAG, "Permission Granted");
        }else {
            listener.onDenied();
            com.itheima.mobilesafe.utils.CLog.d(com.itheima.mobilesafe.HomeActivity.TAG, "Permission Denied");
        }
    }
}