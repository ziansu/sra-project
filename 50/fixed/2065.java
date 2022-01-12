@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mAdapter) != null) {
        ((com.firebase.ui.FirebaseRecyclerAdapter) (mAdapter)).cleanup();
    }
    mFirebaseRef.removeAuthStateListener(mAuthListener);
}