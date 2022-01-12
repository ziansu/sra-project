@java.lang.Override
protected void onResume() {
    boolean newTheme = android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean("theme", false);
    if ((currentTheme) != newTheme) {
        android.content.Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
    super.onResume();
}