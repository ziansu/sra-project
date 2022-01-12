@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (mApp.isBooting()) {
        return ;
    }
    if ((!(isInitialStickyBroadcast())) && (((intent.getFlags()) & (android.content.Intent.FLAG_RECEIVER_REGISTERED_ONLY)) == 0)) {
        return ;
    }
    com.lody.virtual.server.am.PendingResult result = goAsync();
    synchronized(mAMS) {
        if (!(mAMS.handleStaticBroadcast(appId, info, intent, this, result))) {
            result.finish();
        }
    }
}