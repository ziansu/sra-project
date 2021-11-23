@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    if ((LocationUtil.mMarkers.get(marker)) != null) {
        mMarkerId = LocationUtil.mMarkers.get(marker);
        android.util.Log.i("Position of arraylist", ((mMarkerId) + ""));
    }
    return false;
}