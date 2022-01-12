public static double getDistance(com.mapbox.mapboxsdk.geometry.LatLng cluster, com.mapbox.mapboxsdk.geometry.LatLng marker) {
    return (java.lang.Math.pow((((marker.getLatitude()) * 2) - ((cluster.getLatitude()) * 2)), 2)) + (java.lang.Math.pow(((marker.getLongitude()) - (cluster.getLongitude())), 2));
}