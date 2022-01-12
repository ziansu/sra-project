@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.crashlytics.android.Crashlytics.start(this);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, new com.example.helpstackexample.MainActivity.PlaceholderFragment()).commit();
    }
    getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    getSupportActionBar().setDisplayUseLogoEnabled(false);
    getSupportActionBar().setIcon(R.color.hs_transparent_color);
}