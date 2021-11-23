@java.lang.Override
public void onSessionStarted(com.google.android.gms.cast.framework.CastSession session, java.lang.String sessionId) {
    timber.log.Timber.d("VideoDetailsFragment : onSessionStarted()");
    onApplicationConnected(session);
}