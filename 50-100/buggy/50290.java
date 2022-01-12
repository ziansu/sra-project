@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    if ((findViewById(R.id.top_tracks_container)) != null) {
        mTwoPane = true;
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.top_tracks_container, new si.vei.pedram.spotifystreamer.fragments.TopTracksFragment(), si.vei.pedram.spotifystreamer.activities.MainActivity.TOPTRACKSFRAGMENT_TAG).commit();
        }else {
            mTwoPane = false;
        }
    }
}