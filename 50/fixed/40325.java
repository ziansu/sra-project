private void onAuthenticationSuccess(com.google.firebase.auth.FirebaseUser firebaseUser) {
    saveNewUser(firebaseUser.getUid(), user.getName(), user.getEmail(), user.getImage());
}