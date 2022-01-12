@java.lang.Override
public void onProviderDisabled(java.lang.String provider) {
    lmgr.removeUpdates(this);
    if ((track) != null) {
        if (track.getTrackPoints().isEmpty()) {
            track = null;
        }else {
            track = null;
        }
    }
    android.widget.Toast.makeText(getBaseContext(), "Gps turned off, GPS tracking not possible ", Toast.LENGTH_LONG).show();
}