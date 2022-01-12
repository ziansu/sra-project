@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    fragmentManager = getFragmentManager();
    addCostFragment = new com.roman.moneytracker.AddcostFragment();
    settingsFragment = new com.roman.moneytracker.SettingsFragment();
    db = openOrCreateDatabase("Costs", com.roman.moneytracker.MODE_PRIVATE, null);
    dbHelper = new com.roman.moneytracker.DatabaseHelper(getApplicationContext());
    dbHelper.onUpgrade(db, 1, 1);
    getFromDb(this.findViewById(R.id.main_container));
}