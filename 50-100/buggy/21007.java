private void startScrollSwipingToRefreshStatusToDefaultStatus() {
    final int currentHeight = mRefreshHeaderContainer.getMeasuredHeight();
    if (currentHeight == 0) {
        return ;
    }
    mScroller.startScroll(0, currentHeight, 0, (-currentHeight), 120);
    postInvalidate();
    setStatus(cc.easyandroid.easyrecyclerview.EasyRecyclerView.STATUS_DEFAULT);
}