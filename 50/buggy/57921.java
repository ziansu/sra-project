@java.lang.Override
public void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
    at.sw2017.q_up.Place p = ((at.sw2017.q_up.Place) (marker.getTag()));
    mapsGoDetails(p.placeId);
}