@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    homePresenter = new com.srijan.motosports.features.home.HomePresenter(this);
    setSupportActionBar(toolbar);
    getSupportActionBar().setTitle("Srijan Motosports");
    setUpNavigationDrawer();
    setFragment(new com.srijan.motosports.features.home.fragment.HomeFragment());
}