public synchronized int getPosition() {
    if (((currentTrackPlayer) != null) && (currentTrackPlayer.isPlaying()))
        return currentTrackPlayer.getCurrentPosition();
    
    android.util.Log.d(org.fitchfamily.android.symphony.MusicService.TAG, "getPosition() not playing?");
    return 0;
}