@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initAppPreferences();
    if (prefs.getBoolean("firstrun", true)) {
        firstRunInitialization();
        prefs.edit().putBoolean("firstrun", false).commit();
    }
    android.content.Intent intent = getIntent();
    int value = intent.getIntExtra(com.alphan.mcan.snoozecharity.viewModels.MainActivity.WHICH_PAGE_INT, 1);
    initViewPager();
    initActionBar();
    mViewPager.setCurrentItem(value);
}