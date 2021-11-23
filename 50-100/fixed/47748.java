private void mirrorWaypoints() {
    com.google.android.gms.maps.model.LatLng pointA = waypoints.get(0);
    com.google.android.gms.maps.model.LatLng pointB = waypoints.get(1);
    com.google.android.gms.maps.model.LatLng mirror = new com.google.android.gms.maps.model.LatLng(pointB.latitude, pointA.longitude);
    waypoints.add(mirror);
    markWaypoint(mirror, "green");
    createDJIWaypoint(mirror);
    mirror = new com.google.android.gms.maps.model.LatLng(pointA.latitude, pointB.longitude);
    markWaypoint(mirror, "green");
    waypoints.add(mirror);
    createDJIWaypoint(mirror);
    add.setEnabled(false);
}