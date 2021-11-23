@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    if (requestCode == (ness.tomerbu.edu.toolbarsdemo.MainActivity.REQUEST_CALL)) {
        if ((permissions[0]) == (Manifest.permission.CALL_PHONE)) {
            if ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
                call(null);
            }
        }
    }
}