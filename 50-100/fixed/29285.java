@java.lang.Override
protected void onPostExecute(java.lang.Void nothing) {
    lineOptions.addAll(points);
    lineOptions.width(10);
    lineOptions.color(Color.RED);
    googleMap.addPolyline(lineOptions);
    if ((currentLocation) != null) {
        com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(currentLocation, 12);
        googleMap.animateCamera(cameraUpdate);
    }
}