private void resizeIcon(com.google.android.gms.maps.model.LatLng pos, int scaleFactor) {
    int i = removeMarker(pos);
    android.graphics.Bitmap halfsizeBitmap = helper.scaleBitmap(scaleFactor);
    markerArrayList.add(i, mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(pos).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(halfsizeBitmap))));
}