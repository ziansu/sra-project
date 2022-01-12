@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    switch (requestCode) {
        case ph.intrepidstream.callmanager.ui.MainActivity.PERMISSION_REQUEST_CALL_PHONE :
            {
                if ((grantResults.length) > 0) {
                    if ((grantResults[0]) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
                        if (android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(this, permissions[0])) {
                            showRequestPermissionRationale(this);
                        }
                    }
                }
            }
    }
}