@java.lang.Override
public void onStart() {
    super.onStart();
    mAuth.addAuthStateListener(mAuthListener);
    com.google.firebase.auth.FirebaseUser currentUser = mAuth.getCurrentUser();
    updateUI(currentUser);
}