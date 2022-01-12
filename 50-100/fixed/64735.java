@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    android.view.View firstView = findStartView(recyclerView);
    if (firstView == null) {
        clearStickyHeader();
        return ;
    }
    java.lang.Integer childPosition = ((java.lang.Integer) (firstView.getTag(R.id.recyclerext_view_child_position)));
    if (childPosition == null) {
        return ;
    }
    long headerId = getHeaderId(adapter, childPosition);
    if (headerId != (currentStickyId)) {
        performHeaderSwap(headerId);
    }
}