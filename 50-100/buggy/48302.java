public void logout() {
    com.app.salpo.skillzapp.util.SkillzSharedPreferences.setBooleanPreference("loggedIn", false);
    com.app.salpo.skillzapp.util.SkillzSharedPreferences.setStringPreference("token", "");
    com.app.salpo.skillzapp.util.SkillzSharedPreferences.setIntPreference("id", (-1));
    android.content.Intent intent = new android.content.Intent(this, com.app.salpo.skillzapp.login.LoginActivity.class);
    startActivity(intent);
    finish();
}