@java.lang.Override
public void scanFinished(int routeId) {
    mLog.d((("[scanFinished][" + (mRouteManager.getInstallRouteDescription(routeId))) + "]"));
    com.iwedia.example.tvinput.ui.SetupActivity.mDtvManager.getChannelManager().refreshChannelList();
    onClickScanAction(null);
    android.content.Intent intent = new android.content.Intent("com.iwedia.tifservice.TIF_CHANNEL_DB_UPDATED");
    sendBroadcast(intent);
}