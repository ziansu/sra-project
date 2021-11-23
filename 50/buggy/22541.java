@java.lang.Override
public void onRefresh() {
    page = 1;
    requsetTransaction();
    refreshview.setRefreshing(false);
}