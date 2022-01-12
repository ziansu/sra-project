public void onNestedScroll(android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
    dispatchNestedScroll(dxConsumed, dyConsumed, dyUnconsumed, dyUnconsumed, mParentOffsetInWindow);
    final int dy = dyUnconsumed + (mParentOffsetInWindow[1]);
    if (dy < 0) {
        mTotalDraggedOffset -= dy;
        onDragOffsetChange(mTotalDraggedOffset);
    }
}