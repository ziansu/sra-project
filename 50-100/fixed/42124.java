@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    if (savedInstanceState != null) {
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, new com.scoopmovies.thesam.scoopmovies.MainActivityFragment()).commit();
    }
}