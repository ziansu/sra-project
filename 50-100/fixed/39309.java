@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    if (requestCode == (magazoo.magazine.langa.tine.MainActivity.MY_LOCATION_REQUEST_CODE)) {
        if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
            setMyLocationEnabled();
        }else {
            requestLocationPermissions();
        }
    }
}