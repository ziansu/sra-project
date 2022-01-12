@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    switch (requestCode) {
        case info.guardianproject.pixelknot.SendActivity.READ_EXTERNAL_STORAGE_PERMISSION_REQUEST :
            {
                if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                    applyCurrentMode();
                }
            }
    }
}