@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = getUser();
    if (user != null) {
        onSignedInInitialise();
    }else {
        onSignedOutCleanUp();
        startActivityForResult(com.firebase.ui.auth.AuthUI.getInstance().createSignInIntentBuilder().setIsSmartLockEnabled(false).setProviders(java.util.Arrays.asList(new com.firebase.ui.auth.AuthUI.IdpConfig.Builder(com.firebase.ui.auth.AuthUI.EMAIL_PROVIDER).build(), new com.firebase.ui.auth.AuthUI.IdpConfig.Builder(com.firebase.ui.auth.AuthUI.GOOGLE_PROVIDER).build(), new com.firebase.ui.auth.AuthUI.IdpConfig.Builder(com.firebase.ui.auth.AuthUI.FACEBOOK_PROVIDER).build())).build(), com.example.admin1.gymtracker.activities.BaseClass.RP_SIGN_IN_ID);
    }
}