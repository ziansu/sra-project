@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.i(com.intersog.androidcourse.rimma.googlemaphw19.MapsActivity.TAG, "onCreate");
    setContentView(R.layout.activity_maps);
    setUpMapIfNeeded();
    buildGoogleApiClient();
    createLocationRequest();
}