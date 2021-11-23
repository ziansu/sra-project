private java.lang.Boolean zoomOnMarkers() {
    try {
        int padding = 150;
        com.google.android.gms.maps.model.LatLngBounds.Builder builder = new com.google.android.gms.maps.model.LatLngBounds.Builder();
        for (com.google.android.gms.maps.model.Marker marker : mapMarkers) {
            builder.include(marker.getPosition());
        }
        com.google.android.gms.maps.model.LatLngBounds bounds = builder.build();
        com.rota.rngmaps.CameraUpdate cu = com.rota.rngmaps.CameraUpdateFactory.newLatLngBounds(bounds, padding);
        map.animateCamera(cu);
        return true;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
}