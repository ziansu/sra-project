private void refreshMap() {
    if ((mMap) != null) {
        com.google.android.gms.maps.model.LatLng temp1 = new com.google.android.gms.maps.model.LatLng(myRoute.get(0).getLatitude(), myRoute.get(0).getLongitude());
        mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(temp1));
    }
    return ;
}