@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    if ((marker.getTag()) != null) {
        int rackId = ((int) (marker.getTag()));
        launchDetailActivity(rackId);
    }
    return true;
}