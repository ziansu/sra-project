public void getProfile() {
    java.lang.String uid = com.google.firebase.auth.FirebaseAuth.getInstance().getCurrentUser().getUid();
}