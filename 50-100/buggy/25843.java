@java.lang.SuppressWarnings(value = "unused")
public void onEventMainThread(com.app.afridge.dom.SyncEvent event) {
    getActivity().sendBroadcast(new android.content.Intent(com.app.afridge.ui.MainActivity.ACTION_FINISHED_SYNC));
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