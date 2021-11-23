private void addIcon(com.google.maps.android.ui.IconGenerator iconFactory, java.lang.CharSequence text, com.google.android.gms.maps.model.LatLng position) {
    com.google.android.gms.maps.model.MarkerOptions markerOptions = new com.google.android.gms.maps.model.MarkerOptions().icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(iconFactory.makeIcon(text.toString()))).position(position).anchor(iconFactory.getAnchorU(), iconFactory.getAnchorV());
    getMap().addMarker(markerOptions);
}