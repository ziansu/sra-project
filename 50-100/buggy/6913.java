@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    if ((LocationUtil.mMarkers.get(marker)) != null) {
        mMarkerId = LocationUtil.mMarkers.get(marker);
        android.util.Log.i("Position of arraylist", ((mMarkerId) + ""));
        android.widget.Toast.makeText(this, ("ID" + (mMarkerId)), Toast.LENGTH_SHORT).show();
    }
    return false;
}