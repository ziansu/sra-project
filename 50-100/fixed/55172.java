private boolean checkDistance(com.google.android.gms.maps.model.LatLng markerPoint) {
    double distance = java.lang.Math.sqrt(((java.lang.Math.pow(((myLoc.latitude) - (markerPoint.latitude)), 2)) + (java.lang.Math.pow(((myLoc.longitude) - (markerPoint.longitude)), 2))));
    return (maxDistance) >= distance;
}