@java.lang.Override
public void onSessionResumed(com.google.android.gms.cast.framework.CastSession session, boolean wasSuspended) {
    timber.log.Timber.d("VideoDetailsFragment : onSessionResumed()");
    onApplicationConnected(session);
}