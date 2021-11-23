@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user != null) {
        android.widget.Toast.makeText(this, "You are signed in to fatties mobile app", Toast.LENGTH_SHORT).show();
        getUser(user);
    }else {
        startActivityForResult(com.firebase.ui.auth.AuthUI.getInstance().createSignInIntentBuilder().setIsSmartLockEnabled(false).setProviders(java.util.Arrays.asList(new com.firebase.ui.auth.AuthUI.IdpConfig.Builder(com.firebase.ui.auth.AuthUI.GOOGLE_PROVIDER).build())).build(), com.louanimashaun.fattyzgrill.MealsActivity.RC_SIGN_IN);
    }
}