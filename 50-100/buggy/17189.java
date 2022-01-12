@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mManager = getSupportFragmentManager();
    if ((mManager) == null) {
        finish();
        return ;
    }
    if (savedInstanceState == null) {
        mManager.beginTransaction().replace(android.R.id.content, com.jerryfeng.gravitysandbox.SettingsFragment.newInstance(this)).commit();
    }
}