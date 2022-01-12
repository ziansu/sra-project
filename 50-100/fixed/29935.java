@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_song_info);
    if (savedInstanceState != null) {
        song = savedInstanceState.getParcelable("song");
    }else {
        android.content.Intent selectedSong = getIntent();
        android.os.Bundle data = selectedSong.getExtras();
        song = data.getParcelable("song");
    }
    android.util.Log.d("oncreate", song.toString());
    getSong(song);
}