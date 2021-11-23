public void play() {
    android.util.Log.v(com.example.madisonn.musicplayer.PlayerService.LOG_TAG, "play");
    mediaPlayer.start();
    playerPlaying = true;
}