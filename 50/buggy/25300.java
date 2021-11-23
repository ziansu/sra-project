@java.lang.Override
public void run() {
    try {
        updateList.setAdapter(listAdapterForUpdate);
        swipeRefreshLayout.setRefreshing(false);
    } catch (java.lang.Exception ignored) {
    }
}