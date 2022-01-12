@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    newLoc = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
    marker = newMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(newLoc).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
    newMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.zoomTo(18));
    newMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(newLoc));
}