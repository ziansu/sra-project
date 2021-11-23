@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    android.util.Log.i(LOG_TAG, "onRequestPermissionResult");
    switch (requestCode) {
        case GPS_PERMISSION :
            {
                if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                    android.util.Log.d(LOG_TAG, "Permission to GPS Granted");
                    mGpsPermission = true;
                    weather.scheduleWeather(this);
                }else {
                    android.util.Log.d(LOG_TAG, "Permission to GPS Denied");
                }
            }
    }
}