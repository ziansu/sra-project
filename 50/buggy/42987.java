@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    lon = location.getLongitude();
    lat = location.getLatitude();
    if ((reset) == false)
        findAddress();
    
    progress.dismiss();
}