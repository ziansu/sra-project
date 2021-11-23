@java.lang.Override
public void onResult(com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
    handleSignInResult(googleSignInResult);
    com.oligon.bienentracker.ui.activities.HomeActivity.sp.edit().putBoolean("database_old", true).apply();
}