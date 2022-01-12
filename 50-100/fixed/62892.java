@java.lang.Override
public void onStart() {
    super.onStart();
    mGoogleApiClient.connect();
    com.google.firebase.auth.FirebaseUser currentUser = mAuth.getCurrentUser();
    android.database.Cursor cursor = sqliteUser.query();
    user = sqliteUser.getUserFromSQLite(cursor);
    if ((currentUser != null) && ((user) != null)) {
        startMainActivity(user);
    }
}