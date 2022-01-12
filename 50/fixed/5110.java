@java.lang.Override
public void onPreExecute() {
    if ((wait) != null) {
        wait.show();
    }else {
        swipeRefreshLayout.setRefreshing(true);
    }
}