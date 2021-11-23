@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    if (android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean("theme", true)) {
        currentTheme = true;
        setTheme(R.style.DarkAppTheme);
    }else {
        currentTheme = false;
        setTheme(R.style.LightAppTheme);
    }
    super.onCreate(savedInstanceState);
}