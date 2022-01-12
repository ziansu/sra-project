@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    android.util.Log.i(com.odinarts.android.storagescanner.MainActivity.TAG, ("OnCreate:" + (savedInstanceState == null ? "" : savedInstanceState.toString())));
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
        mFragment = new com.odinarts.android.storagescanner.DoWorkFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, mFragment).commit();
    }
}