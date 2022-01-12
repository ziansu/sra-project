@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    name = user.getDisplayName();
    if (user != null) {
        getSupportActionBar().setTitle((("Welcome, " + (user.getDisplayName())) + "!"));
    }else {
    }
}