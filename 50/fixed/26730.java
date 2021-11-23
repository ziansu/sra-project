@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if (location != null) {
        if ((PositionMarker) != null)
            moveMarker(PositionMarker, location);
        
    }
}