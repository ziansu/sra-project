@java.lang.Override
public void onGPSConnect(com.example.user01.planit.GPSEvent e) {
    if (requestingLocationUpdates) {
        gps.startLocationUpdates();
        currLocation = e.getLocation();
    }
}