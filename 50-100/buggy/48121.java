@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
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