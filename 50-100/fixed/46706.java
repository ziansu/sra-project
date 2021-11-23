public void AddAsMarker(com.google.android.gms.maps.GoogleMap mMap, android.content.res.Resources resources) {
    android.graphics.Bitmap iconBitmap = parent.GetIconTypeBitmap(getType());
    com.google.android.gms.maps.model.MarkerOptions mkrOptPass = new com.google.android.gms.maps.model.MarkerOptions().position(getLocation());
    mkrOptPass.icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(parent.GetIconTypeBitmap(getType())));
    marker = mMap.addMarker(mkrOptPass);
    hasBeenAddedToMap = true;
}