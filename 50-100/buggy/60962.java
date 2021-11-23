@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    lastLocation = location;
    gpsLog.log(location);
    areaTrigger.changeLocation(location.getLatitude(), location.getLongitude());
    if (areaTrigger.entered()) {
        sendNotification();
    }
}