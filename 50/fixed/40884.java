@java.lang.Override
public void onLoadMore(int page, int totalItemsCount) {
    int curSize = mAdapter.getItemCount();
    page = page + 1;
    customLoadMoreDataFromApi(page);
}