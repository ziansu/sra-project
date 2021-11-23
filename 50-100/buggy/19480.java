@java.lang.Override
public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
    android.util.Log.d(ie.macinnes.tvheadend.tvinput.LiveSession.TAG, (((("Session onPlayerStateChanged: " + playbackState) + " (") + (mSessionNumber)) + ")"));
    switch (playbackState) {
        case com.google.android.exoplayer2.ExoPlayer.STATE_READY :
            notifyVideoAvailable();
            break;
        case com.google.android.exoplayer2.ExoPlayer.STATE_BUFFERING :
            notifyVideoUnavailable(TvInputManager.VIDEO_UNAVAILABLE_REASON_BUFFERING);
            break;
        case com.google.android.exoplayer2.ExoPlayer.STATE_IDLE :
        case com.google.android.exoplayer2.ExoPlayer.STATE_ENDED :
            notifyVideoUnavailable(TvInputManager.VIDEO_UNAVAILABLE_REASON_UNKNOWN);
            break;
    }
}