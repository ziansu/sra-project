private void onSignedInInitialize(java.lang.String username, java.lang.String uid, java.lang.String email) {
    if (!(uid.isEmpty())) {
        mUsername = username;
        com.amycui.medsminder.ui.MainActivity.mUserUid = uid;
        mUserEmail = email;
        addNewUserToUserEntry();
        getSupportLoaderManager().initLoader(com.amycui.medsminder.ui.MainActivity.PRESCRIPTION_LOADER, null, this);
    }
}