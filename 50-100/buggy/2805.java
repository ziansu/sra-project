@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    for (com.teamcow.wheresmystuff.model.LostItem lostItem : lostList) {
        com.google.android.gms.maps.model.LatLng current = new com.google.android.gms.maps.model.LatLng(lostItem.getX_Coord(), lostItem.getY_Coord());
        mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(current).title(lostItem.getName()).snippet(lostItem.getDescription()));
        mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(current));
    }
}