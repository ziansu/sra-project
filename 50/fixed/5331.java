@java.lang.Override
protected void onDestroy() {
    com.spotify.sdk.android.player.Spotify.destroyPlayer(this);
    super.onDestroy();
}