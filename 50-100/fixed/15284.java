@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    if (savedInstanceState != null) {
        com.scoopmovies.thesam.scoopmovies.DetailActivityFragment detailActivityFragment = new com.scoopmovies.thesam.scoopmovies.DetailActivityFragment();
        getFragmentManager().beginTransaction().add(R.id.activity_detail_fragment, detailActivityFragment).commit();
    }
}