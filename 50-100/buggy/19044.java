@java.lang.Override
protected void onStart() {
    super.onStart();
    if (started) {
        return ;
    }
    started = true;
    this.initWidget();
    this.initColorTheme(null, getString(R.string.nav_settings), R.color.colorPrimary);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        getWindow().setNavigationBarColor(android.support.v4.content.ContextCompat.getColor(this, R.color.colorPrimary));
    }
    com.wangdaye.waves.ui.fragment.SettingsFragment settingsFragment = new com.wangdaye.waves.ui.fragment.SettingsFragment();
    getFragmentManager().beginTransaction().replace(R.id.activity_settings_fragment, settingsFragment).commit();
}