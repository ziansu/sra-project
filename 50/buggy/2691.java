@java.lang.Override
public void onLocationFound(android.location.Location location) {
    android.widget.Toast.makeText(getApplicationContext(), ("Latitude - " + (location.getLatitude())), Toast.LENGTH_SHORT).show();
}