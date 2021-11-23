@java.lang.Override
protected void onPostExecute(java.lang.Void nothing) {
    com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(currentLocation, 12);
    lineOptions.addAll(points);
    lineOptions.width(10);
    lineOptions.color(Color.RED);
    googleMap.animateCamera(cameraUpdate);
    googleMap.addPolyline(lineOptions);
}