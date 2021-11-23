@java.lang.Override
public int onStartCommand(final android.content.Intent intent, final int flags, final int startId) {
    mLogger.info(("onStartCommand: intent=" + intent));
    if ((intent != null) && ((intent.getExtras()) != null)) {
        mLogger.info(("onStartCommand: extras=" + (toString(intent.getExtras()))));
    }
    return super.onStartCommand(intent, flags, startId);
}