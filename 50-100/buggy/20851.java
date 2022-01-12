@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    android.util.Log.d(TAG, ((("onCreate() called with: " + "savedInstanceState = [") + savedInstanceState) + "]"));
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_brewery_profil);
    breweryName = getIntent().getStringExtra(android.epsi.com.bebeer.activities.brewery.profile.BreweryProfilActivity.EXTRA_BREWERY_NAME);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.activity_brewery_profil_toolbar)));
    setSupportActionBar(toolbar);
    android.epsi.com.bebeer.services.remote.ApiClient apiClient = new android.epsi.com.bebeer.services.remote.ApiClient(this);
    setUpBrewery(apiClient);
    setUpBeerList();
}