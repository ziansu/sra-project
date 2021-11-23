@java.lang.Override
public void run() {
    updateList.setAdapter(listAdapterForUpdate);
    swipeRefreshLayout.setRefreshing(false);
}