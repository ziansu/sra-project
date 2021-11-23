@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mContainerId = R.id.fragment_container;
    initializeAppBar();
    initializeFragment();
    locationClient = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(this);
    mRequestingLocation = false;
    mLastUpdateTime = "";
    createGoogleApiClient();
    createLocationRequest();
    createLocationSettingsRequest();
}