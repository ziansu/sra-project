@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String prevChildKey) {
    com.google.android.gms.maps.model.LatLng newLocation = new com.google.android.gms.maps.model.LatLng(dataSnapshot.child("latitude").getValue(java.lang.Double.class), dataSnapshot.child("longitude").getValue(java.lang.Double.class));
    mGoogleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(newLocation).title(dataSnapshot.child("title").getValue(java.lang.String.class)));
}