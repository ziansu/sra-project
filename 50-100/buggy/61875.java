@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    if (holder instanceof qiu.niorgai.refreshview.bottom.AutoLoadRecyclerView.WrapAdapter.FooterViewHolder) {
        int lastPosition = getLastPosition();
        int childCount = getLayoutManager().getChildCount();
        if (lastPosition < childCount) {
            if (isHasMore) {
                mLoadingView.changeToClickStatus(onLoadMoreListener);
            }
        }else {
            if (isHasMore) {
                mLoadingView.changeToLoadingStatus();
            }
        }
    }else {
        mAdapter.onBindViewHolder(holder, position);
    }
}