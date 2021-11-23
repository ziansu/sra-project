@java.lang.Override
public void onPreExecute() {
    if ((wait) != null) {
        wait.show();
    }
    swipeRefreshLayout.setRefreshing(true);
}