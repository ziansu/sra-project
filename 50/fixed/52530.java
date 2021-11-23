@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    android.util.Log.d(com.ccaroni.kreasport.activities.SignupActivity.LOG, "callback");
    if (user != null) {
        sendVerificationEmail(user);
    }
}