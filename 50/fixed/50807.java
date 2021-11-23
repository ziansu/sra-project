@java.lang.Override
public void onStart() {
    super.onStart();
    mAuth.addAuthStateListener(mAuthListener);
}