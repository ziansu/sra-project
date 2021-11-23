@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    com.grp10.codepath.travelmemo.firebase.Trip trip = dataSnapshot.getValue(com.grp10.codepath.travelmemo.firebase.Trip.class);
    if (trip != null) {
        tvTripName.setText(trip.getName());
        tvTripDesc.setText(trip.getDescription());
    }
    android.util.Log.d(((com.grp10.codepath.travelmemo.utils.Constants.TAG) + (getClass().getName())), ((("Key=" + (dataSnapshot.getKey())) + " value= ") + (trip.getName())));
}