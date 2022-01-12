private void handleIntent(android.content.Intent intent) {
    final int configScreenId = intent.getIntExtra(org.droidplanner.android.activities.ConfigurationActivity.EXTRA_CONFIG_SCREEN_ID, mConfigScreenId);
    final android.support.v4.app.Fragment currentFragment = getCurrentFragment();
    if ((currentFragment == null) || ((getIdForFragment(currentFragment)) != configScreenId)) {
        mConfigScreenId = configScreenId;
        getSupportFragmentManager().beginTransaction().replace(R.id.configuration_screen, getFragmentForId(configScreenId)).commit();
    }
}