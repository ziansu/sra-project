@java.lang.Override
public void refreshList(org.jsoup.nodes.Document doc) {
    document = doc;
    populateList();
    mAdapter.notifyDataSetChanged();
}