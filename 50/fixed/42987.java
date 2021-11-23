@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    progress.dismiss();
    lon = location.getLongitude();
    lat = location.getLatitude();
    if ((reset) == false)
        findAddress();
    
}