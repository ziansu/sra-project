@java.lang.Override
public void onRequestPermissionsResult(int requestcode, java.lang.String[] perms, int[] grantResults) {
    if (requestcode == 100) {
        if ((grantResults.length) > 0) {
            for (int i = 0; i < (grantResults.length); i++) {
                if ((grantResults[i]) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
                    android.widget.Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        }
    }
}