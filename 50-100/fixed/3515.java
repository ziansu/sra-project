public void getUserDetails() {
    mFirebaseAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
    mFirebaseUser = mFirebaseAuth.getCurrentUser();
    mUsername = mFirebaseUser.getDisplayName();
    mUsermail = mFirebaseUser.getEmail();
    mPhotoUrl = mFirebaseUser.getPhotoUrl().toString();
}