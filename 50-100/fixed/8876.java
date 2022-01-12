private void signout() {
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putBoolean(LogInActivity.IS_LOGGED_IN_STR, false);
    editor.putString(LogInActivity.USER_LOGGED_IN_STR, "");
    editor.putString(LogInActivity.USER_PASSWORD_STR, "");
    editor.commit();
    finish();
}