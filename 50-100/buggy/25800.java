public static void checkPermission(android.content.Context context) {
    if (context != null) {
        if (((android.support.v4.app.ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
            return ;
        }
    }
}