@java.lang.Override
public int scrollVerticallyBy(int dy, android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state) {
    int scroll = super.scrollVerticallyBy(dy, recycler, state);
    if ((java.lang.Math.abs(scroll)) > 0) {
        positioner.updateHeaderState(findFirstVisibleItemPosition(), getVisibleHeaders(), viewRetriever);
    }
    return scroll;
}