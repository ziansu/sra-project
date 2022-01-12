@java.lang.Override
public void onLoadMore(int page, final int totalItemsCount, android.support.v7.widget.RecyclerView view) {
    downloadArticles(page, false);
}