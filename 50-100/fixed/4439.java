public android.location.Location getLocation() {
    android.location.Location location = null;
    if ((gpsTracker) == null) {
        gpsTracker = new net.walklight.busio.utils.GPSTracker(context);
        location = gpsTracker.getLocation();
    }else {
        location = gpsTracker.getLocation();
    }
    return location;
}