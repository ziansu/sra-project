@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] results) {
    if ((results[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        determineCurrentLocation();
    }else {
    }
}