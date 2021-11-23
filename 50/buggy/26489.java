@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.d("GPSTest", "onLocationChanged called");
    org.redcross.openmapkit.tagswipe.TagEdit.updateUserLocationTags(location);
}