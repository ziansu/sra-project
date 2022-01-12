@java.lang.Override
public void onInitialized(com.spotify.sdk.android.player.Player player) {
    mPlayer.setConnectivityStatus(getNetworkConnectivity(this));
    mPlayer.addConnectionStateCallback(this);
    mPlayer.addPlayerNotificationCallback(this);
    mTrackUriHead = mPlayListTrackUris.get(0);
    mPlayer.play(mTrackUriHead);
    android.widget.ImageButton play = ((android.widget.ImageButton) (findViewById(R.id.playButton)));
    play.setImageDrawable(getResources().getDrawable(R.drawable.pause));
    getTrackAlbumArt(mPlayListTrackUris.get(0));
}