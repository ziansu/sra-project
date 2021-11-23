@java.lang.Override
public boolean onSetSurface(android.view.Surface surface) {
    if ((exoPlayer) == null)
        exoPlayer = new com.felkertech.channelsurfer.players.TvInputPlayer();
    
    android.util.Log.d(TAG, "Set to surface");
    exoPlayer.setSurface(surface);
    mSurface = surface;
    return true;
}