@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    firebaseUser = firebaseAuth.getCurrentUser();
    if ((firebaseUser) != null) {
        onSignedInInitialized();
        setUserOnlineStatusTo(com.android.summer.csula.foodvoter.HomeActivity.ONLINE);
    }else {
        onSignedOutCleanup();
        startActivityForResult(com.firebase.ui.auth.AuthUI.getInstance().createSignInIntentBuilder().setIsSmartLockEnabled(false).setAvailableProviders(java.util.Arrays.asList(new com.firebase.ui.auth.AuthUI.IdpConfig.Builder(com.firebase.ui.auth.AuthUI.EMAIL_PROVIDER).build(), new com.firebase.ui.auth.AuthUI.IdpConfig.Builder(com.firebase.ui.auth.AuthUI.GOOGLE_PROVIDER).build())).build(), com.android.summer.csula.foodvoter.HomeActivity.REQUEST_CODE_SIGN_IN);
    }
}