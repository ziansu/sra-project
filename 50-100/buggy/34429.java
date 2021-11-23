@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user != null) {
        getUserDataFromDB(getUserInfo());
        com.google.firebase.auth.UserInfo userInfo = user.getProviderData().get(1);
        if (userInfo.getProviderId().contains("book")) {
            isGoogle = false;
        }
        android.util.Log.d(LOG_TAG, ("onAuthStateChanged:signed_in:" + (user.getUid())));
    }else {
        android.util.Log.d(LOG_TAG, "onAuthStateChanged:signed_out");
    }
}