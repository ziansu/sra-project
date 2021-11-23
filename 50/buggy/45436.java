@java.lang.Override
public void setSurface(android.view.Surface surface) {
    android.util.Log.d(com.example.xwalkproxy.XWalkExoMediaPlayer.TAG, "==== in setSurface ");
    player.setSurface(surface);
    mVideoSizeChangedListener.onVideoSizeChanged(null, 640, 360);
    player.setSelectedTrack(0, ExoPlayer.TRACK_DEFAULT);
}