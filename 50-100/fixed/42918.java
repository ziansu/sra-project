@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_locations);
    mFragmentManager = getSupportFragmentManager();
    mActionBar = getSupportActionBar();
    if (savedInstanceState == null) {
        mLocationsListFragment = io.stormcast.app.stormcast.location.list.LocationsListFragment.newInstance();
        mFragmentManager.beginTransaction().replace(R.id.locations_content, mLocationsListFragment).commit();
    }
    if ((mActionBar) != null)
        mActionBar.setTitle("Locations");
    
}