@java.lang.SuppressWarnings(value = "unused")
public void onEventMainThread(com.app.afridge.dom.SyncEvent event) {
    if (isAdded()) {
        setLastSyncTimestamp();
        if ((swipeRefreshLayout) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }
    switch (event.message) {
        case IDLE :
            break;
        case SYNCING :
            break;
        case SUCCESS :
            break;
        case FAILED :
            break;
    }
}