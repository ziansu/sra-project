@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    lat = location.getLatitude();
    lng = location.getLongitude();
    com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(lat, lng);
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(latLng));
    mMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.zoomTo(18));
    if (!(enemiesSet)) {
        setupEnemies();
    }else {
        detectEnemy();
    }
}