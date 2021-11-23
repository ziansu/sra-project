private void saveUserInfo(java.lang.String firstname, java.lang.String lastname, java.lang.String dateofbirth, java.lang.String localityAddress, java.lang.String email, java.lang.String gender) {
    app.favloc.com.favouritelocations.UserData userData = new app.favloc.com.favouritelocations.UserData(firstname, lastname, dateofbirth, localityAddress, gender, email);
    com.google.firebase.auth.UserProfileChangeRequest userProfileChangeRequest = new com.google.firebase.auth.UserProfileChangeRequest.Builder().setDisplayName(firstname).build();
    firebaseAuth.getCurrentUser().updateProfile(userProfileChangeRequest);
    databaseReference.child(firebaseAuth.getCurrentUser().getUid()).setValue(userData);
}