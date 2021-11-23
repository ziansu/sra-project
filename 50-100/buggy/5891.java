@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.settings);
    android.app.FragmentManager mFragmentManager = getFragmentManager();
    android.app.FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
    com.example.tomas.beavents.SettingsActivity.PrefsFragment mPrefsFragment = new com.example.tomas.beavents.SettingsActivity.PrefsFragment();
    mFragmentTransaction.replace(R.id.content_frame, mPrefsFragment);
    mFragmentTransaction.commit();
    super.onCreateDrawer();
}