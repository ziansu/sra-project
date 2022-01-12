@java.lang.Override
public void onStart() {
    super.onStart();
    mAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
    com.google.firebase.auth.FirebaseUser currentUser = mAuth.getCurrentUser();
    if (redirectToLogin) {
        onAuthFailed(mAuth, currentUser);
    }else {
        onAuthSuccess(currentUser);
    }
}