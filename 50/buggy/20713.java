@java.lang.Override
public void refreshList(org.jsoup.nodes.Document doc) {
    listItems.clear();
    mAdapter.notifyDataSetChanged();
    document = doc;
    populateList();
    mAdapter.notifyDataSetChanged();
    mSwipeRefreshLayout.setRefreshing(false);
}