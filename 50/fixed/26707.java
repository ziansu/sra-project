protected void removeAuthStateListener() {
    if ((mAuthStateListener) != null) {
        mFirebaseAuth.removeAuthStateListener(mAuthStateListener);
    }
}