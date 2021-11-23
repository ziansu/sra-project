@java.lang.Override
public void onPause() {
    super.onPause();
    nowPlaying.setAnimated(false);
    mediaPlayer.pause();
    listener.songPause();
    launchNotification(false);
    setMediaSessionState();
}