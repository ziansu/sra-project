@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_map);
    com.dev.cromer.jason.whatsappening.activities.MapActivity.searchBarEditText = ((android.widget.EditText) (findViewById(R.id.searchBarEditText)));
    com.dev.cromer.jason.whatsappening.activities.MapActivity.searchBarEditText.setOnClickListener(this);
    setUpGoogleApiClient();
    com.google.android.gms.maps.MapFragment mapFragment = ((com.google.android.gms.maps.MapFragment) (getFragmentManager().findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
}