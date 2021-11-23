@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    android.util.Log.d(Constants.TAG, ("User: " + (user.getUid())));
    if (user != null) {
        switchToPhotoListFragment(user.getUid());
    }else {
        switchToLoginFragment();
    }
}