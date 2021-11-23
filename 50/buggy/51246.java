@java.lang.Override
protected void onDestroy() {
    deinitPreferencesListener();
    super.onDestroy();
    com.bx5a.minstrel.youtube.YoutubePlayer.getInstance().reset();
    com.bx5a.minstrel.player.History.getInstance().setContext(null);
}