@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    preferences = getSharedPreferences(com.yubico.yubioath.MainActivity.NEO_STORE, Context.MODE_PRIVATE);
    keyManager = new com.yubico.yubioath.model.KeyManager(preferences);
    openFragment(new com.yubico.yubioath.fragments.SwipeListFragment());
    tagDispatcher = nordpol.android.TagDispatcher.get(this, this, false, false, true, false, true);
}