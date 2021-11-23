@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_nearby);
    if ((getSupportActionBar()) != null) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    registerLocationManager();
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    fr.free.nrw.commons.nearby.NearbyListFragment fragment = new fr.free.nrw.commons.nearby.NearbyListFragment();
    ft.add(R.id.container, fragment);
    ft.commit();
}