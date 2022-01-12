public void onNestedScroll(android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
    com.huangxueqin.listcomponent.PullRefreshLayout.D(("onNestedScroll: dyUnConsumed = " + dyUnconsumed));
    dispatchNestedScroll(dxConsumed, dyConsumed, dyUnconsumed, dyUnconsumed, mParentOffsetInWindow);
    final int dy = dyUnconsumed + (mParentOffsetInWindow[1]);
    com.huangxueqin.listcomponent.PullRefreshLayout.D(("onNestedScroll: dyUnConsumed + mParentOffsetInWindow = " + dy));
    if (dy < 0) {
        mTotalDraggedOffset -= dy;
        onDragOffsetChange(mTotalDraggedOffset);
    }
}