@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_layout);
    context = getApplicationContext();
    sharedPreferences = getSharedPreferences("userDataPreferences", com.steeve.steeveapp.MODE_PRIVATE);
    android.util.Log.v(LOG_TAG, ("MainActivity preferences: " + (sharedPreferences.getAll().toString())));
    setupStats();
    setupListeners();
    setupList();
    setupDrawer();
}