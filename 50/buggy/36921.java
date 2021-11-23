public static java.lang.String getUserEmail() {
    com.google.firebase.auth.FirebaseUser firebaseUser = com.google.firebase.auth.FirebaseAuth.getInstance().getCurrentUser();
    return firebaseUser.getEmail();
}