@java.lang.Override
public void onStop() {
    super.onStop();
    if ((mAuthListener) != null) {
        mAuth.removeAuthStateListener(mAuthListener);
        mAuth.signOut();
    }
}