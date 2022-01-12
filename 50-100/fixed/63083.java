@java.lang.Override
public int scrollHorizontallyBy(final int dx, final android.support.v7.widget.RecyclerView.Recycler recycler, final android.support.v7.widget.RecyclerView.State state) {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            detachAndScrapAttachedViews(recycler);
            offsetChildrenHorizontal((-dx));
            horizontalOffset += dx;
            if (!(state.isPreLayout())) {
                recycleAndFill(recycler);
            }
        }
    }).start();
    return dx;
}