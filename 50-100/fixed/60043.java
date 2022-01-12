@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user != null) {
        com.superpak.sammengistu.stuckapp.activities.StuckSignUpActivity.putEmailInSharedPref(user.getEmail().toLowerCase(), this, user.getProviders().get(0));
        createUserInFBHelper(mEncodedEmail);
    }
}