@java.lang.Override
public void onLayoutChildren(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state) {
    if ((state.getItemCount()) == 0) {
        removeAndRecycleAllViews(recycler);
        currentPosition = pendingPosition = com.yarolegovich.discretescrollview.DiscreteScrollLayoutManager.NO_POSITION;
        scrolled = pendingScroll = 0;
        return ;
    }
    boolean isFirstOrEmptyLayout = (getChildCount()) == 0;
    if (isFirstOrEmptyLayout) {
        initChildDimensions(recycler);
    }
    updateRecyclerDimensions();
    detachAndScrapAttachedViews(recycler);
    fill(recycler);
    applyItemTransformToChildren();
    notifyFirstLayoutCompleted();
}