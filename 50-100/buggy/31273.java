private void onAuthSuccess(com.google.firebase.auth.FirebaseUser user) {
    java.lang.String username = usernameFromEmail(user.getEmail());
    writeNewUser(user.getUid(), username, user.getEmail());
    java.lang.String type = appType();
    sharedPreferences.edit().putString("appType", type).apply();
    android.content.Intent intent = new android.content.Intent(this, com.slothnull.android.medox.Splash.class);
    startActivity(intent);
    finish();
}