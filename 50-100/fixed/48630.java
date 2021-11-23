@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = mAuth.getCurrentUser();
    if (user != null) {
        getSupportActionBar().setTitle((("Welcome, " + (user.getDisplayName())) + "!"));
        if (((RegisterActivity.firstName) != null) && ((user.getDisplayName()) != (RegisterActivity.firstName))) {
            getSupportActionBar().setTitle((("Welcome, " + (RegisterActivity.firstName)) + "!"));
        }
        initMap();
    }
}