@java.lang.Override
public int getSpanSize(int position) {
    if (isLoadMore(position)) {
        if ((mLoadState) == (LoadMoreView.LoadState.ERROR)) {
            mLoadState = LoadMoreView.LoadState.IDLE;
        }
    }
    if (((isHeader(position)) || (isFooter(position))) || (isLoadMore(position))) {
        return gridLayoutManager.getSpanCount();
    }
    if (spanSizeLookup != null) {
        return spanSizeLookup.getSpanSize(position);
    }
    return 1;
}