@java.lang.Override
public void onCreate() {
    super.onCreate();
    this.buildMediaSession();
    this.mPlayingQueue = new java.util.ArrayList<>();
    this.mDelayedStopHandler = new com.dreamdigitizers.androidbaselibrary.views.classes.services.ServiceMediaPlayer.DelayedStopHandler(this);
    this.mMediaPlayerNotificationReceiver = this.createMediaPlayerNotificationReceiver();
    this.mPlayback = this.createPlayback();
    this.mPlayback.setState(PlaybackStateCompat.STATE_NONE);
    this.mPlayback.setCallback(this);
    this.updatePlaybackState(null);
}