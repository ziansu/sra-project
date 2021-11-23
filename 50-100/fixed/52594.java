private void addMarker(org.charmeck.trailofhistory.core.model.PointOfInterest poi, int index) {
    com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(poi.getLatitude(), poi.getLongitude());
    com.google.android.gms.maps.model.BitmapDescriptor pin = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(R.drawable.ic_map_pin_normal);
    com.google.android.gms.maps.model.Marker marker = map.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(latLng).title(poi.getName()).icon(pin));
    marker.setTag(index);
    markers.add(marker);
}