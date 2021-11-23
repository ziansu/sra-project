private void removeGroundOverlays(java.util.HashMap<com.google.maps.android.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> groundOverlays) {
    for (com.google.android.gms.maps.model.GroundOverlay groundOverlay : groundOverlays.values()) {
        if (groundOverlay != null) {
            groundOverlay.remove();
        }
    }
}