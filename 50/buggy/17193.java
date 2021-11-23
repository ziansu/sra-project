@java.lang.Override
protected void onDestroy() {
    unregisterBroadCastReceivers();
    if (isFinishing()) {
        stopService(new android.content.Intent(this, de.roughriders.jf.eta.services.DistanceNotificationService.class));
        de.roughriders.jf.eta.helpers.Logger.getInstance().close();
    }
    super.onDestroy();
}