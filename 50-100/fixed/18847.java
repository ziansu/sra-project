@java.lang.Override
public void run() {
    if (((loadMoreAvailable) && ((loadMoreListener) != null)) && (!(mAdapter.isLoading()))) {
        mAdapter.setLoading(true);
        loadMoreListener.onLoadMore(currentPage);
    }
}