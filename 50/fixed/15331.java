@java.lang.Override
protected void onActive() {
    super.onActive();
    if ((queuedRefresh) != null) {
        sendBroadcast(refreshContext, queuedRefresh);
        loadData(queuedRefresh);
        queuedRefresh = null;
        refreshContext = null;
    }
}