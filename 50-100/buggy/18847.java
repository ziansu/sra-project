@java.lang.Override
public void run() {
    if (((loadMoreAvailable) && ((loadMoreListener) != null)) && (!(mAdapter.isLoading()))) {
        loadMoreListener.onLoadMore(currentPage);
        mAdapter.setLoading(true);
    }
}