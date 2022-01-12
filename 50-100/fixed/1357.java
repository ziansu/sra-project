@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_new_game_settings);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    layout.NewGameSettingsFragment fragment = layout.NewGameSettingsFragment.newInstance(null, null);
    de.uulm.mal.fancyquartett.activities.FragmentManager manager = getSupportFragmentManager();
    de.uulm.mal.fancyquartett.activities.FragmentTransaction transaction = manager.beginTransaction();
    transaction.replace(R.id.new_game_settings_relativelayout, fragment, "newgamesettingsfragment");
    transaction.commit();
}