@java.lang.Override
public void onClick(android.view.View view) {
    nowPlayingIntent = new android.content.Intent(this, com.example.android.musique.NowPlaying.class);
    startActivity(nowPlayingIntent);
}