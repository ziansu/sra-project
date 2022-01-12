public void setStopsMarkers() {
    for (edu.oregonstate.beaverbus.Stop stop : edu.oregonstate.beaverbus.MapState.mStops) {
        stop.setMarker(edu.oregonstate.beaverbus.MapState.mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(stop.getLatLng()).infoWindowAnchor(0.5F, 0.25F).title(stop.getName()).visible(mStopsVisible).alpha(1.0F).anchor(0.5F, 0.5F).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(R.drawable.marker_dot_plus))));
    }
}