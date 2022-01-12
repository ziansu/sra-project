public void updateCredentials(java.lang.String school, java.lang.String username, java.lang.String password) {
    android.content.SharedPreferences prefs = this.getSharedPreferences(eu.magisterapp.magister.MagisterApp.PREFS_NAME, 0);
    prefs.edit().putString(eu.magisterapp.magister.MagisterApp.PREFS_SCHOOL, school).putString(eu.magisterapp.magister.MagisterApp.PREFS_USERNAME, username).putString(eu.magisterapp.magister.MagisterApp.PREFS_PASSWORD, password).apply();
}