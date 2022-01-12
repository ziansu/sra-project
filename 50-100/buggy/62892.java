@java.lang.Override
public void onStart() {
    super.onStart();
    mGoogleApiClient.connect();
    com.google.firebase.auth.FirebaseUser currentUser = mAuth.getCurrentUser();
    if (currentUser != null) {
        android.database.Cursor cursor = sqliteUser.query();
        user = sqliteUser.getUserFromSQLite(cursor);
        startMainActivity(user);
    }
}