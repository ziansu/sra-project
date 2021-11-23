@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mCurrentLocation = location;
    mLastUpdateTime = java.text.DateFormat.getTimeInstance().format(new java.util.Date());
    android.widget.Toast.makeText(this, "Location Updated", Toast.LENGTH_SHORT).show();
}