private void setUpMap() {
    com.google.android.gms.maps.model.LatLng conventionLocation = new com.google.android.gms.maps.model.LatLng(amai.org.conventions.model.conventions.Convention.getInstance().getLatitude(), amai.org.conventions.model.conventions.Convention.getInstance().getLongitude());
    mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(conventionLocation).title(("\u200e" + (getResources().getString(R.string.arrival_methods_marker_name, amai.org.conventions.model.conventions.Convention.getInstance().getDisplayName())))));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(conventionLocation, 16));
}