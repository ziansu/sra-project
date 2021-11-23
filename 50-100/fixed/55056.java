@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if ((location != null) && ((user) != null)) {
        ref = com.google.firebase.database.FirebaseDatabase.getInstance().getReference(Params.MEMBER_LOCATION);
        com.firebase.geofire.GeoFire geoFire = new com.firebase.geofire.GeoFire(ref);
        geoFire.setLocation(user.getUid(), new com.firebase.geofire.GeoLocation(location.getLatitude(), location.getLongitude()));
        refToMemberList = com.google.firebase.database.FirebaseDatabase.getInstance().getReference(Params.MEMBER_GROUP_LIST);
    }else
        return ;
    
}