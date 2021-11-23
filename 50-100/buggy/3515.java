public void getUserDetails() {
    mFirebaseAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
    mFirebaseUser = mFirebaseAuth.getCurrentUser();
    if ((mFirebaseUser) == null) {
        startActivity(new android.content.Intent(this, com.saurabh.wings2017.signIn.class));
        finish();
        return ;
    }else {
        mUsername = mFirebaseUser.getDisplayName();
        mUsermail = mFirebaseUser.getEmail();
        mPhotoUrl = mFirebaseUser.getPhotoUrl().toString();
    }
}