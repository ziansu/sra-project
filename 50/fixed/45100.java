public static boolean verifyStoragePermissions(android.app.Activity activity) {
    int permission = android.support.v4.app.ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);
    if (permission != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(activity, com.balloon.printer.printpdf.MainActivity.PERMISSIONS_STORAGE, com.balloon.printer.printpdf.MainActivity.REQUEST_EXTERNAL_STORAGE);
    }
    return true;
}