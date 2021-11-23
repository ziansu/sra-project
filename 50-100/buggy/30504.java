@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    switch (requestCode) {
        case gruppn.kasslr.CameraActivity.REQUEST_CAMERA_PERMISSION :
            if (((permissions.length) != 1) || ((grantResults.length) != 1)) {
                throw new java.lang.RuntimeException("Error on requesting camera permission.");
            }
            if ((grantResults[0]) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
                android.widget.Toast.makeText(this, "Please give camera permission", Toast.LENGTH_SHORT).show();
            }
            break;
    }
}