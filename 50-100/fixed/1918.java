@java.lang.Override
public void onArticlesReady(java.util.List<com.qvdev.apps.readerkid.utils.ItemWrapper> items) {
    if ((mCovers.isEmpty()) && (!(items.isEmpty()))) {
        mCovers.addAll(items);
        mCoverAdapter.notifyDataSetChanged();
        loadIssueArticles(0);
    }else {
        super.onArticlesReady(items);
    }
}