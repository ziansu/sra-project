@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.support.v4.media.session.MediaButtonReceiver.handleIntent(mediaSession, intent);
    return super.onStartCommand(intent, flags, startId);
}