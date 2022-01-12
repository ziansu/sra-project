private void broadcastMessage() {
    int timeElapsed = nanodegree.nemesisdev.com.spotifystreamer.Services.SpotifyStreamerService.mPlayer.getCurrentPosition();
    android.content.Intent intent = new android.content.Intent(getString(R.string.BROADCAST_STATUS));
    intent.putExtra(getString(R.string.broadcast_track), mTracks.get(mTrackPos));
    intent.putExtra(getString(R.string.broadcast_is_playing), mIsPlaying);
    intent.putExtra(getString(R.string.broadcast_time_elapsed), timeElapsed);
    intent.putExtra(getString(R.string.broadcast_new_track), mNewTrack);
    mBroadcastManager.sendBroadcast(intent);
}