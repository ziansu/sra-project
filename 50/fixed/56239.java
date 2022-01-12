@java.lang.Override
protected void onStart() {
    super.onStart();
    mAuth.addAuthStateListener(mAuthListener);
}