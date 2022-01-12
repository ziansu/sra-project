protected void saveLoginSetup() {
    loginPrefs = getSharedPreferences("loginPrefs", com.example.noah.onthefly.activities.MODE_PRIVATE);
    loginPrefsEditor = loginPrefs.edit();
    saveLogin = loginPrefs.getBoolean("saveLogin", false);
    usernameField.setText(loginPrefs.getString("username", ""));
    passwordField.setText(loginPrefs.getString("password", ""));
    if ((saveLogin) == true) {
        rememberMe.setChecked(true);
        login(login);
    }
}