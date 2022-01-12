@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user != null) {
        java.lang.String uid = user.getUid();
        userId = user.getUid();
        android.widget.Toast.makeText(activity, ("test " + (userName)), Toast.LENGTH_LONG).show();
        addEventListener(uid);
    }else {
        android.widget.Toast.makeText(activity, "not Logged in", Toast.LENGTH_LONG).show();
    }
}