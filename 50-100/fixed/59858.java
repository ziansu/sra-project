@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user != null) {
        android.util.Log.d(com.example.sjors.sjors_witteveen_pset6.SignInActivity.TAG, ("onAuthStateChanged:signed_in:" + (user.getUid())));
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.sjors.sjors_witteveen_pset6.MainActivity.class);
        startActivity(intent);
    }
}