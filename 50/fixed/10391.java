@java.lang.Override
public void onClick(android.view.View view) {
    addFooterView(mLoadingView);
    if ((mLoadMoreListener) != null) {
        mLoadMoreListener.onLoadMore(true);
    }
}