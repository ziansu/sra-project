@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user != null) {
        android.util.Log.d("FIREBASE_AUTH", ("onAuthStateChanged:signed_in:" + (user.getUid())));
    }else {
        android.util.Log.d("FIREBASE_AUTH", "onAuthStateChanged:signed_out");
    }
}