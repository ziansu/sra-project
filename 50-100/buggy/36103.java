@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.content.Intent logInt = new android.content.Intent(this, com.sparkmap.sparkmap.LoginActivity.class);
    startActivity(logInt);
    supportMapFragment = com.google.android.gms.maps.SupportMapFragment.newInstance();
    supportMapFragment.getMapAsync(this);
    sFM = getSupportFragmentManager();
    sFM.beginTransaction().replace(R.id.map, supportMapFragment).commit();
}