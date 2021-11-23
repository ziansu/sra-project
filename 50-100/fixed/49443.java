@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getValue()) != null) {
        double Lat = ((java.lang.Double) (dataSnapshot.child("LAT").getValue()));
        double Long = ((java.lang.Double) (dataSnapshot.child("LONG").getValue()));
        friendLoc = new com.google.android.gms.maps.model.LatLng(Lat, Long);
        friendMarker.setPosition(new com.google.android.gms.maps.model.LatLng(Lat, Long));
    }
}