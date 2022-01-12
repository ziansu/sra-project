public void remove(uts.sep.tcba.sepprototype.Model.Availability currentAvailability, java.lang.String userID) {
    com.google.firebase.database.FirebaseDatabase database = com.google.firebase.database.FirebaseDatabase.getInstance();
    com.google.firebase.database.DatabaseReference ref = database.getReference().child("Users").child(userID).child(("Availabilities/" + (currentAvailability.getID())));
    android.util.Log.d("REF", ref.toString());
    ref.setValue(null);
    ref.addListenerForSingleValueEvent();
}