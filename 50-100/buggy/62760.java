private void addMarker(org.unpidf.univmobile.data.entities.Poi p, com.google.android.gms.maps.model.BitmapDescriptor des) {
    com.google.android.gms.maps.model.MarkerOptions options = new com.google.android.gms.maps.model.MarkerOptions();
    options.icon(des);
    options.anchor(0.5F, 0.5F);
    options.position(new com.google.android.gms.maps.model.LatLng(java.lang.Double.parseDouble(p.getLat()), java.lang.Double.parseDouble(p.getLng())));
    options.title(p.getName());
    com.google.android.gms.maps.model.Marker m = mMap.addMarker(options);
}