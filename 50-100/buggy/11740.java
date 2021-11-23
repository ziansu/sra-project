@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    getFragmentManager().beginTransaction().add(R.id.content_settings, new com.example.android.sunshine.app.SettingsFragment()).commit();
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}