public void onStop() {
    gac.disconnect();
    if ((mAuthListener) != null) {
        mAuth.removeAuthStateListener(mAuthListener);
    }
    org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    super.onStop();
}