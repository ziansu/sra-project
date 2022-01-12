@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        switch (requestCode) {
            case REQUEST_LOCATION :
                getMyLocation();
                isLocatOK = true;
                break;
            case REQUEST_SCREEN_SHOT :
                captureScreen(REQUEST_SCREEN_SHOT);
                break;
        }
    }else {
    }
}