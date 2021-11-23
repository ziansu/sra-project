@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    switch (requestCode) {
        case br.usp.ime.mac5743.ep1.seminarioime.activity.ReadQRCodeActivity.MY_PERMISSIONS_REQUEST_CAMERA :
            {
                if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                    executePermissionGranted();
                }else {
                    executePermissionDenied();
                }
            }
    }
}