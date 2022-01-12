@java.lang.Override
public void onAction() {
    getData(searchWord, 0);
    refreshRecyclerView.dismissRefresh();
}