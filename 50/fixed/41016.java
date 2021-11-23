@java.lang.Override
public void onSessionResumeFailed(com.google.android.gms.cast.framework.CastSession session, int error) {
    onApplicationDisconnected();
}