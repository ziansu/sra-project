@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    rvSong = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.rView)));
    rvSong.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    com.gorynalexander.audioplayergoryn.SongsAdapter songsAdapter = new com.gorynalexander.audioplayergoryn.SongsAdapter(uploadSongs());
    rvSong.setAdapter(songsAdapter);
}