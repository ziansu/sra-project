public synchronized int getDuration() {
    if ((currentTrackPlayer) != null)
        return currentTrackPlayer.getDuration();
    
    android.util.Log.d(org.fitchfamily.android.symphony.MusicService.TAG, "getDuration() not playing?");
    return 0;
}