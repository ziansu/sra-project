public java.lang.Double distanceBetween(com.google.android.gms.maps.model.LatLng point1, com.google.android.gms.maps.model.LatLng point2) {
    if ((point1 == null) || (point2 == null)) {
        return 0.0;
    }else {
        return com.google.maps.android.SphericalUtil.computeDistanceBetween(point1, point2);
    }
}