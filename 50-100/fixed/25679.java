@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setTheme(new pt.ipp.estg.cmu.settings.PreferencesSettings(this).getThemePreference());
    setContentView(R.layout.activity_categoria);
    isAdmin = getIntent().getBooleanExtra(Util.ARG_ADMIN, false);
    if (isAdmin) {
        mNavigationView.setCheckedItem(R.id.nav_admin);
        buildDialog();
    }else {
        mNavigationView.setCheckedItem(R.id.nav_game);
        if (null == savedInstanceState) {
            startFragmetCategoria();
        }
    }
}