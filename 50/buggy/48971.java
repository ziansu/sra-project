@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent nowPlayingIntent = new android.content.Intent(this, com.example.android.musique.NowPlaying.class);
    if (songSelected) {
        startActivity(nowPlayingIntent);
    }
}