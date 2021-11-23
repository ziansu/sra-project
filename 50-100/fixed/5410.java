@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    switch (requestCode) {
        case novitskyvitaly.geogroupproject.MainActivity.ACTION_CODE_START_SCREEN_ON_STARTUP :
            break;
        case novitskyvitaly.geogroupproject.MainActivity.ACTION_CODE_START_LOCATION_REPORT_SERVICE :
            if (!(LocationListenerService.IsServiceRunning))
                novitskyvitaly.geogroupproject.LocationListenerService.startLocationListenerService(this);
            
            break;
    }
}