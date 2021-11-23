@java.lang.Override
public void onPlaybackStateUpdated(android.support.v4.media.session.PlaybackStateCompat newState) {
    if ((mMediaSession) != null)
        mMediaSession.setPlaybackState(newState);
    
    com.quovantis.music.helper.LoggerHelper.d(("New State : " + (newState.toString())));
    if ((newState.getState()) == (android.support.v4.media.session.PlaybackStateCompat.STATE_STOPPED)) {
        removeNotifications();
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(IntentKeys.CLOSE_MUSIC_ACTION);
        sendBroadcast(intent);
        stopSelf();
    }
}