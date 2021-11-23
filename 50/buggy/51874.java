@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
    getFragmentManager().beginTransaction().replace(R.id.settings_content, new project.android.udacity.com.popularmovies.app.SettingsFragment()).commit();
}