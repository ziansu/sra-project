@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = mAuth.getCurrentUser();
    if (user != null) {
        getSupportActionBar().setTitle((("Welcome, " + (RegisterActivity.firstName)) + "!"));
        if (getSupportActionBar().getTitle().equals("Welcome, null!")) {
            getSupportActionBar().setTitle((("Welcome, " + (user.getDisplayName())) + "!"));
        }
        initMap();
    }
}