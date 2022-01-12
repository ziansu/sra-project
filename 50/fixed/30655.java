@java.lang.Override
public void onSuccess(int newUpdatesNumber) {
    updateRefreshingFlag();
    initializeUpdatesList(amai.org.conventions.model.conventions.Convention.getInstance().getUpdates(), newUpdatesNumber);
    setUpdatesVisibility();
    recyclerView.scrollToPosition(0);
}