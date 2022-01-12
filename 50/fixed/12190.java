@java.lang.Override
protected void loadMoreItems() {
    isLoading = true;
    (mCurrentPage)++;
    loadNextPage();
}