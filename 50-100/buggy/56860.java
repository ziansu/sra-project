@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    if ((com.google.sample.echo.MainActivity.AUDIO_ECHO_REQUEST) != 0) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
    for (int res : grantResults) {
        if (res != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            permissionGranted = false;
            return ;
        }
    }
}