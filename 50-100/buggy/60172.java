@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.preference.PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
    getSupportFragmentManager().beginTransaction().add(R.id.fragmentcontent, new felza.galgeleg3ugers.MenuElements.MainMenuFragment()).commit();
}