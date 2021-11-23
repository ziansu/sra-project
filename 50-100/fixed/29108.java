@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if (location != null) {
        lat = location.getLatitude();
        lon = location.getLongitude();
        com.example.netlog.common.Logger.log(("Location changed: " + location));
        broadcastLocationData();
        if (isSyncWhenLocationChangedEnabled()) {
            syncDataWithServer();
        }
    }
}