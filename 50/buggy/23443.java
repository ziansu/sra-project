@java.lang.Override
public void onMapClick(com.google.android.gms.maps.model.LatLng latLng) {
    com.google.android.gms.maps.model.MarkerOptions options = new com.google.android.gms.maps.model.MarkerOptions().position(latLng);
    options.title(getAddressFromLatLng(latLng));
    options.icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker());
}