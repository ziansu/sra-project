@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.app_bar)));
    setSupportActionBar(toolbar);
    mIsTwoPaneLayout = (findViewById(R.id.top_tracks_container)) != null;
    if ((mIsTwoPaneLayout) && (savedInstanceState == null)) {
        getSupportFragmentManager().beginTransaction().replace(R.id.top_tracks_container, new com.spotify.sdliles.spotifystreamer.UI.TopTracksFragment()).commit();
    }
}