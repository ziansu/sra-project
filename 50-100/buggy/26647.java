private void updateMapMarkers(io.realm.RealmResults<com.abramov.artyom.parentcontrol.domain.Loc> locs) {
    if ((mMap) == null) {
        return ;
    }
    for (com.abramov.artyom.parentcontrol.domain.Loc loc : locs) {
        mMap.clear();
        mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(loc.getLatitude(), loc.getLongitude())).title(loc.getTitle()));
    }
}