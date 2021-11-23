@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initFab();
    initRecyclerView();
    inAlphabeticalOrder = android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean("alphabetic", true);
}