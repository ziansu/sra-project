private java.util.List<com.google.android.gms.maps.model.LatLng> getWaypoints(java.util.List<com.itis.practice1.model.Place> places) {
    android.util.Log.d("tag", ((("current: " + (mLatitude)) + "; ") + (mLongitude)));
    java.util.List<com.google.android.gms.maps.model.LatLng> waypoints = new java.util.ArrayList<>();
    waypoints.add(new com.google.android.gms.maps.model.LatLng(mLatitude, mLongitude));
    for (com.itis.practice1.model.Place place : places) {
        waypoints.add(new com.google.android.gms.maps.model.LatLng(place.getLatitude(), place.getLongitute()));
    }
    return waypoints;
}