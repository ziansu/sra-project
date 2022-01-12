@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    inAlphabeticalOrder = android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean("alphabetic", true);
    initFab();
    initRecyclerView();
}