@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_track);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction().add(R.id.trackContainer, new com.princecoder.nanodegree.spotifytreamer.TopTrackFragment()).commit();
    }
}