private void getCurrentUser() {
    mUser = mFirebaseAuth.getCurrentUser();
    if ((mUser) != null) {
        isLoggedIn = true;
        userDisplayName = mUser.getDisplayName();
        userId = mUser.getUid();
        userEmail = mUser.getEmail();
    }else {
        isLoggedIn = false;
        userDisplayName = "";
        userId = "";
        userEmail = "";
    }
}