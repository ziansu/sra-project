@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    waypointStore = new au.com.criterionsoftware.waypoints.WaypointStore();
    mapHandler = new au.com.criterionsoftware.waypoints.MapHandler(this, waypointStore);
    waypointStore.restoreState(savedInstanceState);
    mapHandler.restoreState(savedInstanceState);
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (getSupportFragmentManager().findFragmentById(R.id.map)));
    mapFragment.getMapAsync(mapHandler);
}