@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    checkPassword = sp.getBoolean("Password", false);
    password = sp.getString("PasswordValue", "0000");
    com.UtilityClasses.UI.setTheme(this, userUIPreferences.theme);
    if (checkPassword)
        passwordScreen();
    else
        splashScreen();
    
    com.UtilityClasses.UI.setTheme(this, userUIPreferences.theme);
}