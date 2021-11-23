@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    checkPassword = sp.getBoolean("Password", false);
    password = sp.getString("PasswordValue", "0000");
    if (checkPassword)
        passwordScreen();
    else
        splashScreen();
    
}