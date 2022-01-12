private void initializeFirebase() {
    if ((mValueUserListener) == null) {
        mValueUserListener = createUserValueListener();
    }
    mRefUsers = new com.firebase.client.Firebase(com.ygorcesar.jamdroidfirechat.utils.ConstantsFirebase.FIREBASE_URL_USERS);
    mRefUsers.addValueEventListener(mValueUserListener);
}