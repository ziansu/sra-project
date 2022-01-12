@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if ((user != null) && (isFirst)) {
        android.util.Log.d(com.creapple.tms.mobiledriverconsole.login.LoginManager.LOG_TAG, ("Signed in - " + (user.getUid())));
        isFirst = false;
    }else {
        android.util.Log.d(com.creapple.tms.mobiledriverconsole.login.LoginManager.LOG_TAG, "Signed out");
    }
}