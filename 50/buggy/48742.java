@java.lang.Override
public void onLayoutChildren(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state) {
    super.onLayoutChildren(recycler, state);
    if ((getOrientation()) == (HORIZONTAL)) {
        detachAndScrapAttachedViews(recycler);
        fill(recycler);
        mAncorPos = 0;
    }
}