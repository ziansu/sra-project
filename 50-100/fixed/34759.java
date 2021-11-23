@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    if (requestCode == (ness.tomerbu.edu.toolbarsdemo.MainActivity.REQUEST_CALL)) {
        if (permissions[0].equals(Manifest.permission.CALL_PHONE)) {
            if ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
                call(null);
            }
        }
    }
}