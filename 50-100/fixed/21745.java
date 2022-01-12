private void sendRegistrationToServer(java.lang.String refreshedToken) {
    com.polito.mad17.madmax.services.FirebaseServiceFCM.firebaseDatabase = com.polito.mad17.madmax.activities.MainActivity.getDatabase();
    databaseReference = com.polito.mad17.madmax.services.FirebaseServiceFCM.firebaseDatabase.getReference();
    databaseReference.child("users").child(com.polito.mad17.madmax.activities.MainActivity.getCurrentUser().getID()).child("token").setValue(refreshedToken);
}