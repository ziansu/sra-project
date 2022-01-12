private void setUpMyMap(com.google.android.gms.maps.model.LatLng latLng) {
    android.util.Log.d(iiitd.ac.in.dsys.meetup.Activities.MeetupActivity.TAG, "setUpMyMap called");
    iiitd.ac.in.dsys.meetup.Activities.MeetupActivity.mMap.clear();
    iiitd.ac.in.dsys.meetup.Activities.MeetupActivity.mMap.setMyLocationEnabled(true);
    iiitd.ac.in.dsys.meetup.Activities.MeetupActivity.mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(latLng));
    iiitd.ac.in.dsys.meetup.Activities.MeetupActivity.mMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.zoomTo(18), 2000, null);
}