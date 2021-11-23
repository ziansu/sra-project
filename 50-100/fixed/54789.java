@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    fab = ((android.support.design.widget.FloatingActionButton) (findViewById(R.id.fabMain)));
    fab.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            getLocation();
        }
    });
    mFusedLocationClient = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(this);
    mLat = 0;
    mLong = 0;
}