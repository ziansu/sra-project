protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if ((findViewById(R.id.track_container)) != null) {
        mTwoPane = true;
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.track_container, new com.dkulon.spotifystreamer.Fragment.SearchTrackFragment(), "TrackFragment").commit();
        }else {
            mTwoPane = false;
        }
    }
}