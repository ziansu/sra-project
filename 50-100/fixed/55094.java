@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if (location != null) {
        from = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
        if ((PositionMarker) != null)
            moveMarker(PositionMarker, location);
        
    }
}