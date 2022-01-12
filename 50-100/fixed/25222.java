@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    if (requestCode == (com.example.android.camera2basic.Camera2BasicFragment.REQUEST_CAMERA_PERMISSION)) {
        if (((grantResults.length) != 1) || ((grantResults[0]) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        }
    }else {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}