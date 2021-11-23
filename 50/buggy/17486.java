@java.lang.Override
public void onGPSConnect(com.example.user01.planit.GPSEvent e) {
    if (requestingLocationUpdates) {
        android.widget.Toast.makeText(this, "Begin location updates", Toast.LENGTH_SHORT).show();
        gps.startLocationUpdates();
        currLocation = e.getLocation();
    }
}