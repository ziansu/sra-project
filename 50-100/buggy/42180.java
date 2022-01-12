@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    mUser = firebaseAuth.getCurrentUser();
    if ((mUser) != null) {
        addUserToDatabaseIfNotThere();
    }else {
        startActivityForResult(com.firebase.ui.auth.AuthUI.getInstance().createSignInIntentBuilder().setIsSmartLockEnabled(false).setProviders(java.util.Arrays.asList(new com.firebase.ui.auth.AuthUI.IdpConfig.Builder(com.firebase.ui.auth.AuthUI.EMAIL_PROVIDER).build(), new com.firebase.ui.auth.AuthUI.IdpConfig.Builder(com.firebase.ui.auth.AuthUI.GOOGLE_PROVIDER).build())).build(), com.example.tahasaber.twsila.MainActivity.RC_SIGN_IN);
    }
}