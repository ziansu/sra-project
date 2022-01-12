@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initiateMenuButton(R.id.menuButton);
    setContentView(R.layout.activity_map);
    localFacade = new com.example.singi_000.prototype1.LocalFacade(new com.example.singi_000.prototype1.LocalManager(this, null, null, 1));
    com.google.android.gms.maps.MapFragment mapFragment = ((com.google.android.gms.maps.MapFragment) (getFragmentManager().findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
    buildGoogleApiClient();
    googleApiClient.connect();
}