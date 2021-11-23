@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.location.Location mCurrentLocation = location;
    android.widget.Toast.makeText(this, ("Point2 :" + (mCurrentLocation.getLatitude())), Toast.LENGTH_SHORT).show();
}