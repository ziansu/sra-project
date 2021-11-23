@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((mAuthStateListener) != null) {
        mFirebaseAuth.removeAuthStateListener(mAuthStateListener);
    }
    detachChildListener();
}